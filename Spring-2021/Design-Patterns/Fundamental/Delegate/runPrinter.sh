#!/bin/sh

javac PrinterDelegate/printers/*.java
javac PrinterDelegate/*.java
java PrinterDelegate.App

rm PrinterDelegate/printers/*.class
rm PrinterDelegate/*.class