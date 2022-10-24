package coding;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class HeapObject implements Serializable , Cloneable {
       private final String name;
       public HeapObject(String name) {
           this. name = name;
       }
       @Override
       protected HeapObject clone() throws CloneNotSupportedException {
           return (HeapObject)super.clone();
       }
     public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
         HeapObject t1 = new HeapObject("test");
         HeapObject t2 = t1.clone();
         HeapObject t3 = serializeAndDeserialize(t1);
         HeapObject t4 = t1;
     }

     private static HeapObject serializeAndDeserialize(HeapObject t1) throws IOException, ClassNotFoundException {
         ByteArrayOutputStream baos = new ByteArrayOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream(baos);
         oos.writeObject(t1);
         ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
         return (HeapObject)ois.readObject();
     }
}

