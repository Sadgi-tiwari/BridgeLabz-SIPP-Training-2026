public class SensorReading{
    public boolean increasing(int[] arr , int index)
    if(arr[index] > arr[index+1])
        return false ; 
    return  increasing(arr ,index: index+1);

}
public static void main(String[] args){
    int[] arr = {10,11,12,13,14};
    SensorReadings r= new SensorReadings();
    boolean ans = r.increasing(arr,index:0);
    System.out.println(ans);
}