package PoolPattern;

public class ObjectPool implements ObjectPool_IF{

    private final Object lockObject;  // The Object that serves as a Thread lock.
    private int size;    // Keeps track of the number of objects currently available  in the pool.
    private int instanceCount;       // Number of Objects created including the ones being used outside.
    private int maxInstances;               // Maximum number of objects that the pool can take.
    private ObjectCreation_IF creator;      // Creates the pool
    private Object[] pool;                  // The pool (a fixed size Array of Objects)
    private static ObjectPool poolInstance; // The pool instance itself.

    /**
     * Constructor
     * @param c
     * @param max
     */
    private ObjectPool(ObjectCreation_IF c, int max){
        lockObject = new Object();
        maxInstances = max;
        instanceCount = 0;
        size = 0;
        creator = c;
        pool = new Object[maxInstances];
        poolInstance = null;
    }

    private Object createObject(){
        Object newObject = creator.create();
        instanceCount ++;
        return newObject;
    }

    private Object removeObject(){
        Object removedObject = null;
        if(getSize() > 0){
            size --;
            removedObject = pool[size];
            pool[size] = null;
        }

        return removedObject;
    }


    public static ObjectPool getPoolInstance(ObjectCreation_IF c, int max){
        if(poolInstance == null){
            poolInstance = new ObjectPool(c, max);
        }
        return poolInstance;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getCapacity() {
        return pool.length;
    }

    @Override
    public void setCapacity(int c) {
        if(c <= 0){
            String message = "Capacity must be greater that 0 but you gave it: " + c;
            throw new IllegalArgumentException(message);
        }

        synchronized (lockObject){
            Object[] newPool = new Object[c];
            System.arraycopy(pool, 0, newPool, 0, c);
            pool = newPool;
        }
    }

    @Override
    public Object getObject() {
        synchronized (lockObject) {
            if(getSize() > 0){
                return removeObject();
            }else if(instanceCount < getCapacity()){
                return createObject();
            }else{
                return null;
            }
        }
    }

    @Override
    public Object waitForObject() throws InterruptedException {
        synchronized (lockObject){
              do{
                  try{
                      lockObject.wait();  // Wait until notified that an Object has been put back in the pool.
                  }catch (Exception e){
                      System.out.println(e);
                  }

              }while(getSize() <= 0);
              return removeObject();
        }
    }

    @Override
    public void release(Object object) {
        if(object == null){
            throw new NullPointerException();
        }

        synchronized (lockObject){
            if(getSize() < getCapacity()){
                pool[size] = object;
                size ++;
                lockObject.notify();   // Notifies waiting thread that we have put an Object back in the pool.
            }
        }
    }
}