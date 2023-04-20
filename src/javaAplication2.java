package firtina;

public class javaAplication2 {

    public static String[] don(String[]a ){
        int b=a.length;
int boy=a[0].length();
int indis=0;
for (int i=1;i<b;i++){

    if (a[i].length()>=boy){

        boy=a[i].length();
        indis=i;
    }


}
String []dizi=new String[2];
dizi[0]=a[indis];
dizi[1]=Integer.toString(indis);

        return dizi;
    }


    public static void main(String[] args) {
        String a[]={"fak", "saki", "makin", "ok"};
String []c=new String[2];

       c= don(a);
        System.out.println(c[0]);
        System.out.println(c[1]);


    }

}
