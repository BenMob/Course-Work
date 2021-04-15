package PoolPattern;

public interface ObjectPool_IF {
    int getSize();
    int getCapacity();
    void setCapacity(int c);
    Object getObject();
    Object waitForObject() throws InterruptedException;
    void release(Object object);
}
