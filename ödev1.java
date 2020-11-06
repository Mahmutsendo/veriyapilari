class DinamikDizi{
  private int[] arr;
  private int i, size;

  DinamikDizi(){
    this.i = -1;
    this.size = 5;
    this.arr = new int[this.size];
  }
  private int[] copyOf(int[]array, int l){
    int[] copyof = new int[l];
    for(int i=0;i<array.length;i++)
    copyof[i] = array[i]; 
    return copyof;
  }
  void ekle(int val){
    this.i += 1;
    if(i < this.size)
      this.arr[i] = val;
    else{
      this.size *= 2;
      this.arr = this.copyOf(this.arr, this.size);
      this.ekle(val);
    }
  }

  void ekle(int val, int index){
    if(index < this.size){
      this.arr[i++] = 0;
    }
    else
    System.out.println("girdiniz indeks kapasite den hariç !");
  }

  void silval(int val){
    int indexElement = -1;
    for(int j =0; j < this.arr.length; j++){
      if (this.arr[j] == val){
        this.i -= 1;
        indexElement = j; 
        break;
      }
    }
    if(indexElement != -1){
      for(int j = indexElement; j <= i; j++)
        this.arr[j] = this.arr[j+1];
    }
    else
    System.out.println("girdiniz sayi bulunamıyor !");
  }

  void sil(int index){
    if(index < this.i+1){
      this.i -=1;
      for(int j = index; j <= i; j++)
        this.arr[j] = this.arr[j+1];
    }
    else
    System.out.println("girdiniz index kapasite den hariç ! ");
  }
  void sil(){
    this.i -= 1;
  }

  void println(){
    for(int j = 0; j <= this.i; j++)
    System.out.println(this.arr[j]);
  }
  void print(){
    for(int j = 0; j <= this.i; j++){
      if(j == 0){
      System.out.print("["+this.arr[j]);  
      }else if(j == this.i)
      System.out.print(", "+this.arr[j]);
      else
      System.out.print(", "+this.arr[j]);
    }
    System.out.println("]");
  }
  int uzunluk(){
    return this.i+1;
  }
  void temizle(){
    this.size = 5;
    this.arr = new int[this.size];
  }
  int kapasite(){
    return this.size;
  }
}

class Main {
  public static void main(String[] args) {
    DinamikDizi dinamikdizi = new DinamikDizi();
    System.out.println("kapasite: "+dinamikdizi.kapasite());
    dinamikdizi.ekle(1);
    dinamikdizi.ekle(2);
    dinamikdizi.ekle(3);
    dinamikdizi.ekle(4);
    dinamikdizi.ekle(5);
    dinamikdizi.print();
    System.out.println("uzunluk: "+dinamikdizi.uzunluk());
    dinamikdizi.sil(2);
    dinamikdizi.print();
    System.out.println("uzunluk: "+dinamikdizi.uzunluk());
    dinamikdizi.ekle(6);
    dinamikdizi.print();
    System.out.println("uzunluk: "+dinamikdizi.uzunluk());
    dinamikdizi.silval(1);
    dinamikdizi.print();
    System.out.println("uzunluk: "+dinamikdizi.uzunluk());
    dinamikdizi.sil();
    dinamikdizi.print();
    System.out.println("uzunluk: "+dinamikdizi.uzunluk());

  }
}

