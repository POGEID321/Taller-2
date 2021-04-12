package TALLER1.OPERACIONES;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Operaciones {
    
    public void AgregarColumna (JTable tabla, int NFILAS, int NCOLUMNAS){
        int COLUMNASF = NCOLUMNAS + 1;
        String [] Columnas = new String [COLUMNASF];
        for(int i = 0; i < COLUMNASF; i++)
        {
            Columnas [i] = "";
        }
        DefaultTableModel matriz = new DefaultTableModel(null,Columnas);
        for(int i=0; i<NFILAS ; i++)
        {
            String [] fila= new String[COLUMNASF];
            matriz.addRow(fila);
        }
        tabla.setModel(matriz);
    }
    public void EliminarColumna (JTable tabla, int NCOLUMNAS){
        if( NCOLUMNAS > 1 )
        {
            TableColumn columna = tabla.getColumnModel().getColumn(NCOLUMNAS-1);
            tabla.removeColumn(columna);
        }else{
            
        }
    }
    public void AgregarFilas (JTable tabla, int NFILAS, int NCOLUMNAS){
        int FILASF = NFILAS + 1;
        String [] Columnas = new String [NCOLUMNAS];
        for(int i = 0; i < NCOLUMNAS; i++)
        {
            Columnas [i] = "";
        }
        DefaultTableModel matriz = new DefaultTableModel(null,Columnas);
        for(int i = 0; i < FILASF; i++)
        {
            String [] fila= new String[NCOLUMNAS];
            matriz.addRow(fila);
        }
        tabla.setModel(matriz);
    }
    public void EliminarFilas (JTable tabla, int NFILAS, int NCOLUMNAS){
        if(NFILAS > 1){
            String [] Columnas = new String [NCOLUMNAS];
            for(int i = 0; i < NCOLUMNAS; i++)
            {
                Columnas [i] = "";
            }
            DefaultTableModel matriz = new DefaultTableModel(null,Columnas);
            for(int i = 0; i < NFILAS; i++)
            {
                String [] fila= new String[NCOLUMNAS];
                matriz.addRow(fila);
            }
            matriz.removeRow(NFILAS-1);
            tabla.setModel(matriz);
        }
        else{
            
        }
        
        }
   public int [][] sumaMatriz (int [][] matrizA, int [][] matrizB,int filas,int columnas)
    {
        int [][]resultado = new int[filas][columnas];
        for(int i=0;i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    } 
       
   public int [][] RestaMatriz (int [][] matrizA, int [][] matrizB,int filas,int columnas)
    {
        int [][]resultado = new int[filas][columnas];
        for(int i=0;i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        return resultado;
    }    
       public double [][] MultiplicacionMatriz (double [][] matrizA, double [][] matrizB, int FILAS_A, int COLUMNAS_B, int comun ){
        double [][]resultado = new double[FILAS_A][COLUMNAS_B];
        for(int i = 0;i < FILAS_A;i++)
        {
            for(int j = 0; j < COLUMNAS_B; j++)
            {
                for(int k = 0; k < comun; k++)
                {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }
      public double [][] DivisionMatriz (double [][] matrizA, double [][] matrizB,int filas,int columnas,int comun)
    {
        double [][]resultado;
        double [][]inversa = InversaMatriz(matrizB);
        resultado = MultiplicacionMatriz(matrizA, inversa, filas, columnas, comun);
        return resultado;
    } 
      public double [][] TranspuestaMatriz(double matriz[][], int Filas, int Columnas){
        double [][]resultado = new double[Columnas][Filas];
        {
            for(int i=0; i<Filas;i++)
            {
                for(int j=0; j<Columnas; j++)
                {
                    resultado[j][i]=matriz[i][j];
                } 
            }
        }
        return resultado;
    }
      public double [][] InversaMatriz (double [][] matriz){

        double determinante = 1/Determinante(matriz);
        double [][] Adjmatriz = AdjuntaMatriz(matriz);
        double [][] Multiplicacion = Escalar(determinante, Adjmatriz );
        return Multiplicacion;
    }
    public double [][] Escalar (double escalar , double [][] matriz){
        for (int i=0; i<matriz.length; i++)
        {
            for(int j=0; j<matriz.length; j++)
            {
                matriz[i][j] = matriz[i][j]*escalar;
            }
        }
        return matriz;
    }
     
    public double [][] AdjuntaMatriz(double [][] matriz){
        return TranspuestaMatriz(MatrizCofactores(matriz),matriz.length , matriz.length);
    }
    
    public double [][] MatrizCofactores(double [][] matriz){
        double [][] MatrizMenor = new double [matriz.length][matriz.length];
        if(matriz.length==2){
             for (int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz.length; j++){
                    if(i==j && i==0){
                        MatrizMenor[i][j] = matriz[i+1][j+1];
                    }
                    if(i==j && i==1){
                        MatrizMenor[i][j] = matriz[i-1][j-1];
                    }
                    if(i!=j && i==0){
                        MatrizMenor[i][j] -= matriz[i+1][j-1];
                    }
                    if(i!=j && i==1){
                        MatrizMenor[i][j] -= matriz[i-1][j+1];
                    }
                    
                }
                }       
        }
        else{        
        for(int i=0; i<matriz.length; i++)
        {
            for(int j=0; j<matriz.length; j++)
            {
                double [][] det = new double[matriz.length-1][matriz.length-1];
                double Vdeterminante;
                
                for(int k=0; k<matriz.length; k++)
                {
                    if(k!=i)
                    {
                        for(int l=0; l<matriz.length;l++)
                        {
                            if(l!=j)
                            {
                                int indice1 = k<i ? k : k-1;
                                int indice2 = l<j ? l : l-1;
                                det[indice1][indice2] = matriz[k][l];
                            }
                        }
                    }
                }
                Vdeterminante=Determinante(det);
                MatrizMenor[i][j] = Vdeterminante * (double) Math.pow(-1, i+j);
            }
        }
        }
        return MatrizMenor;
    }
  public double Determinante(double [][]matriz){
        if(matriz.length == 2)
        {
            double determinante=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
            return determinante;
        }
        double Suma=0;
        for(int i=0; i<matriz.length; i++)
        {
            double [][] matrizmenor = new double[matriz.length-1][matriz.length-1];
            for(int j=0; j<matriz.length;j++)
            {
                if(j != i)
                {
                    for(int k=1; k<matriz.length; k++)
                    {
                        int indice=-1;
                        if(j < i)
                            indice=j;
                        else if(j > i)
                            indice=j-1;
                        matrizmenor[indice][k-1]=matriz[j][k];
                    }
                }
            }
            if(i%2 == 0)
                Suma+=matriz[i][0] * Determinante(matrizmenor);
            else
                Suma-=matriz[i][0] * Determinante(matrizmenor);
        }
        return Suma;
    }
}