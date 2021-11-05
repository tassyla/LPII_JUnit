package math;

public class Numbers {

    public Boolean quadradoPerfeito(int n){
        return Math.sqrt(n) % 1 == 0;
    }

    public int areaRetangulo(int l, int a){
        return l * a;
    }

    public Boolean divisivel(int n, int d){
        return n % d == 0;
    }
}
