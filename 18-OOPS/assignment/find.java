import java.util.*;


class solution{
    public static void main(String[] args) {
        complex c=new complex(4,5);
        complex d=new complex(5,6);
        
        complex e= complex.add(c,d);
        complex f= complex.add(c,d);
        complex g= complex.add(c,d);

        e.print_complex();
        f.print_complex();
        g.print_complex();
    }
}


class complex{
int real;
int imag;

public complex (int r,int i){
real=r;
imag=i;
}  
public static complex add(complex a, complex b){
    return new complex((a.real+b.real),(a.imag+b.imag));
}  
public static complex diff(complex a, complex b){
    return new complex((a.real-b.real),(a.imag-b.imag));
}  
public static complex product(complex a, complex b){
    return new complex((a.real*b.real)-(a.imag*b.imag),(a.real*b.real)+(a.imag*b.imag));
} 

public void print_complex(){
    if(real==0 && imag!=0){
        System.out.println(imag+"i");
    }
    else if(real!=0 && imag==0){
        System.out.println(real);
    }
    else{
        System.out.println(real+"+"+imag+"i");
    }
}
}
