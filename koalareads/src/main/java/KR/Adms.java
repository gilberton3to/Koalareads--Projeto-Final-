package KR;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author GilbertoNeto and IngridAlmeida
 */
public class Adms extends AbstractTableModel {
    private ArrayList linhas = null;
    private String[] colunas = null;
        
    public Adms(ArrayList lin,String[] col){
        setLinhas(lin);
        setColunas(col);
    }
    public ArrayList getLinhas(){
        return linhas;
    }
    public void setLinhas(ArrayList dados){
        linhas = dados;
    }
    public String [] getColunas(){
        return colunas;
    }
    public void setColunas(String[] nomes){
        colunas = nomes;
    }
    public int getColumnCount(){
        return colunas.length;
    }
    public int getRowCount(){
        return linhas.size();
    }
    public String getColumnName(int numCol){
        return colunas [numCol];
    }
    
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
}