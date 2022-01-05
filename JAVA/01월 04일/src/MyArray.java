public class MyArray {
    int dimension;

    MatrixD2 matD2;
    MatrixD3 matD3;
    public void initMyArray(int dim){
        dimension = dim;

        if(dim == 2){
            matD2 = new MatrixD2();
            matD2.initMatrix();
        }else if(dim == 3){
            matD3 = new MatrixD3();
            matD3.initMatrix();
        }
    }

    public void printMyArray(){
        if(dimension == 2){
            matD2.printMatrix();
        }else if(dimension == 3){
            matD3.printMatrix();
        }
    }
}
