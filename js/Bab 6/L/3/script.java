public class Balok extands PersegiPanjang{
    private int tinggi;
    public void setTinggi(int t){tinggi=t;
    }
    public int getTinggi(){ return tinggi;
    }
    public int Volume() {int v=getpanjang()*getLebar()*tinggi;
    return v;
    }
}