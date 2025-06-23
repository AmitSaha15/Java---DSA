package StackAndQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack st = new CustomStack(5);
        CustomStack dStack = new DynamicStack(5);

//        st.push(12);
//        st.push(18);
//        st.push(22);
//        st.push(52);
//        st.push(8);

        dStack.push(12);
        dStack.push(18);
        dStack.push(22);
        dStack.push(52);
        dStack.push(8);
        dStack.push(99);

        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
    }
}
