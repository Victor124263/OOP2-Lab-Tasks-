public class MultiplicationTable{

public int number,from,to;

public void setData(int no,int from,int to){

    this.number = no;
    this.from = from;
    this.to = to;
}

public void printTable(){

  for(int i = this.from;i<=this.to;i++){

    System.out.println(this.number+"x"+i+" = "+this.number*i);
  }


}

public static void main(String args[]){

    MultiplicationTable table = new MultiplicationTable();
  table.setData(3,3,10);
  table.printTable();
}


}