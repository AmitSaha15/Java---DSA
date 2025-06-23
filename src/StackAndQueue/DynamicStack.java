package StackAndQueue;

public class DynamicStack extends CustomStack{

    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
//            double the size of the array
            int[] temp = new int[data.length*2];

//            copy prev elements
//            for(int i=0; i<data.length; i++){
//                temp[i] = data[i];
//            }
            System.arraycopy(data, 0, temp, 0, data.length);

            data = temp;
        }
//        now the array is not full insert the element like previously
        return super.push(item);
    }
}
