public class Complex {
    double RealPart;
    double ImagePart;
    public Complex(){}
    public Complex(double R,double I){
        this.ImagePart = I;
        this.RealPart = R;
    }
    public static double getRealPart(double R) {  //返回复数的实部
        return R;
    }
    public static double getImagePart(double I) { //返回复数的虚部
        return I;
    }
    Complex ComplexAdd(Complex a){
        Complex temp = new Complex();
        temp.RealPart = RealPart + a.RealPart;
        temp.ImagePart = ImagePart + a.ImagePart;
        return temp;
    }
    Complex ComplexSub(Complex a){
        Complex temp = new Complex();
        temp.RealPart = RealPart - a.RealPart;
        temp.ImagePart = ImagePart - a.ImagePart;
        return temp;
    }
    Complex ComplexMulti(Complex a){
        Complex temp = new Complex();
        temp.RealPart = RealPart * a.RealPart - ImagePart * a.ImagePart;
        temp.ImagePart = ImagePart * a.RealPart + RealPart * a.ImagePart;
        return temp;
    }
    Complex ComplexDiv(Complex a){
        Complex temp = new Complex();
        temp.RealPart = (RealPart * a.ImagePart + ImagePart * a.RealPart)/(a.ImagePart*a.ImagePart + a.RealPart * a.RealPart);
        temp.ImagePart = (ImagePart * a.ImagePart + RealPart * a.RealPart)/(a.ImagePart * a.ImagePart + a.RealPart * a.RealPart);
        return temp;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if(obj==null)
            return false;
        if(obj instanceof Complex){
            Complex p = (Complex) obj;
            if(p.RealPart==this.RealPart &&p.ImagePart==this.ImagePart )
                return true;
        }
        return false;
    }
    public String toString(){
        String str = "";
        if (ImagePart > 0)
            str = RealPart + "+" + ImagePart + "i";
        if (ImagePart == 0)
            str = RealPart+"";
        if (ImagePart < 0)
            str = RealPart + "" + ImagePart + "i";
        return str;
    }
}
