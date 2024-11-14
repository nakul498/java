import java.util.*;


class Lambda {
    public static void main(String[] args) {
        InnerLambda myexp = ()-> System.out.println("hi");
        myexp.artist();
        //Anomonous class java
        InnerLambda cake = new InnerLambda(){
            @Override
            public void artist(){
                System.out.println("hey");
            }
        };
        cake.artist();
    }
    public interface InnerLambda {

        public void artist();    
    }
   
}