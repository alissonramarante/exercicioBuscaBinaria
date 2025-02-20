package solution;

import problems.BuscaBinaria;

public class BuscaBinariaSolution implements BuscaBinaria{

    @Override
    public int buscaIndexOf(int[] array, int key) {
        if(array != null && array.length >= 1){
            return buscaIndexOf(array, key, 0, array.length -1);
        }
        return -1;
    }
    private int buscaIndexOf(int[] array, int key, int left, int right){
        if(left > right){
            return -1;
        }
        int meio = (left + right)/2;
        if(array[meio] == key){
            return meio;
        } else if (array[meio] > key) {
            return buscaIndexOf(array, key,left , meio -1);
        } else{
            return buscaIndexOf(array, key, meio + 1, right);
        }

    }

    @Override
    public int ultimaOcorrencia(int[] array, int key) {
        if(array != null && array.length >= 1){
            return ultimaOcorrencia(array, key, 0, array.length - 1);
        }
        return -1;
    }

    private int ultimaOcorrencia(int[] array, int key, int left, int right){
        if(left > right){
            return -1;
        }
        int meio = (left + right)/2;
        if(array[meio] == key && array[meio+1] != key){
            return meio;
        } else if(array[meio] > key){
            return ultimaOcorrencia(array, key, left, right);
        } else{
            return ultimaOcorrencia(array, key, left, right);
        }
    }

    @Override
    public Integer floor(Integer[] array, Integer key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'floor'");
    }

    @Override
    public Integer ceil(Integer[] array, Integer key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ceil'");
    }

    @Override
    public int primeiraOcorrencia(int[] array, int key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'primeiraOcorrencia'");
    }

    @Override
    public int contarMaiores(int[] array, int key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contarMaiores'");
    }

    @Override
    public int contarMenores(int[] array, int key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contarMenores'");
    }

    @Override
    public int encontrarRaiz(int num, int raiz) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encontrarRaiz'");
    }

    @Override
    public int[] buscarDuplicatas(int[] array) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarDuplicatas'");
    }

    @Override
    public int bitonicPoint(int[] array) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bitonicPoint'");
    }

    @Override
    public char encontrarElemento(char[] array, char letra) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encontrarElemento'");
    }

    @Override
    public String encontrarNome(String[] array, String nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encontrarNome'");
    }
    
}
