public class lastocc{
    public static int lastoccurence(int arr[],int key,int i){

        if(i==arr.length){
            
            return -1;
        }
        int isfound = lastoccurence(arr,key,i+1);
        if(arr[i]==key && isfound == -1) {
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int arr[] = {5,5,5,5};
        System.out.print(lastoccurence(arr,5,0));

    }
}