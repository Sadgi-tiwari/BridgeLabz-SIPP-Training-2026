package string;
public class StringValidator{
    public boolean validator(String userneme , int index){
        if(index==username.lenght())
        {
            return true ;
        }
        char[] ch = username.toCharArray();
        if(ch[index] >= 'a' || ch[index] <= 'z')
             return false ;
        return validator(username , index: index+1);
    }
    public static void main(String[] args){
        StringValidator stringValidator = new StringValidator();
        boolean ans = stringValidator.validator(username:"sahil123" , index:0);
        System.out.println(ans);
    }
}
//throw , throws , finally , finalize , super , super(),this , this();