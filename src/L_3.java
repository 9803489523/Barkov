import java.util.*;

public class L_3 {
    public static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
        /**
         * manipulations with stack
         */
        System.out.println("Введите размерность стэка ");
        Stack<Integer> stack=new Stack<>();
        int size= reader.nextInt();
        inputCollection(size,stack);
        Stack<Integer > copyStack=new Stack<>();
        for(int i=0;i<size;i++){
            if(stack.elementAt(i)>=0)
                copyStack.add(stack.elementAt(i));
        }
        System.out.println("Результат");
        System.out.println(copyStack);
        /**
         * manipulations with queue
         */
        Queue<Integer> queue=new LinkedList<>();
        Queue<Integer> copyQueue=new LinkedList<>();
        System.out.println("Введите размерность очереди: ");
        size= reader.nextInt();
        inputCollection(size,queue);
        int val;
        for(int i=0;i<size;i++){
            val=queue.remove();
            if(val>=0)
                copyQueue.add(val);
        }
        System.out.println("Результат");
        System.out.println(copyQueue);

    }
    public static void inputCollection(int size, Collection<Integer> collection){
        System.out.println("Введите значения");
        for(int i=0;i<size;i++){
            collection.add(reader.nextInt());
        }
        System.out.println("Введенная структура ");
        System.out.println(collection);
    }
}
