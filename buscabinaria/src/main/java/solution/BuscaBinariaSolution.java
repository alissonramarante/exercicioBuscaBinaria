package solution;

import problems.BuscaBinaria;

public class BuscaBinariaSolution implements BuscaBinaria {

    @Override
    public int buscaIndexOf(int[] array, int key) {
        if (array != null && array.length >= 1) {
            return buscaIndexOf(array, key, 0, array.length - 1);
        }
        return -1;
    }

    private int buscaIndexOf(int[] array, int key, int left, int right) {
        if (left > right) {
            return -1;
        }
        int meio = (left + right) / 2;
        if (array[meio] == key) {
            return meio;
        } else if (array[meio] > key) {
            return buscaIndexOf(array, key, left, meio - 1);
        } else {
            return buscaIndexOf(array, key, meio + 1, right);
        }

    }

    @Override
    public int ultimaOcorrencia(int[] array, int key) {
        if (array != null && array.length > 0) {
            return ultimaOcorrencia(array, key, 0, array.length - 1);
        }
        return -1;
    }

    private int ultimaOcorrencia(int[] array, int key, int left, int right) {
        if (left > right) {
            return -1;
        }
        int meio = (left + right) / 2;
        if (array[meio] == key && (meio == right || array[meio + 1] != key)) {
            return meio;
        } else if (array[meio] > key) {
            return ultimaOcorrencia(array, key, left, meio - 1);
        } else {
            return ultimaOcorrencia(array, key, meio + 1, right);
        }
    }

    @Override
    public Integer floor(Integer[] array, Integer key) {
        if (array != null && array.length > 0) {
            return floor(array, key, 0, array.length - 1, null);
        }
        return null;
    }

    private Integer floor(Integer[] array, Integer key, int left, int right, Integer element) {
        if (left > right) {
            return element;
        }
        int meio = (left + right) / 2;
        if (array[meio] == key) {
            return array[meio];
        } else if (array[meio] > key) {
            return floor(array, key, left, meio - 1, element);
        } else {
            return floor(array, key, meio + 1, right, array[meio]);
        }
    }

    @Override
    public Integer ceil(Integer[] array, Integer key) {
        if (array != null && array.length > 0) {
            return ceil(array, key, 0, array.length - 1, null);
        }
        return null;
    }

    private Integer ceil(Integer[] array, Integer key, int left, int right, Integer element) {
        if (left > right) {
            return element;
        }
        int meio = (left + right) / 2;
        if (array[meio] == key) {
            return array[meio];
        } else if (array[meio] > key) {
            return ceil(array, key, left, meio - 1, array[meio]);
        } else {
            return ceil(array, key, meio + 1, right, element);
        }
    }

    @Override
    public int primeiraOcorrencia(int[] array, int key) {
        if (array != null && array.length > 0) {
            return primeiraOcorrencia(array, key, 0, array.length - 1);
        }
        return -1;
    }

    private int primeiraOcorrencia(int[] array, int key, int left, int right) {
        if (left > right) {
            return -1;
        }
        int meio = (left + right) / 2;
        if (array[meio] == key && (meio == 0 || array[meio - 1] != key)) {
            return meio;
        } else if (array[meio] >= key) {
            return primeiraOcorrencia(array, key, left, meio - 1);
        } else {
            return primeiraOcorrencia(array, key, meio + 1, right);
        }
    }

    @Override
    public int countMaior(int[] array, int key) {
        if (array != null && array.length > 0) {
            return contarMaiores(array, key, 0, array.length - 1);
        }
        return -1;
    }

    private int contarMaiores(int[] array, int key, int left, int right) {
        if (left > right) {
            return 0;
        }
        int meio = (left + right) / 2;
        int count = 0;
        if (array[meio] > key) {
            count = 1 + contarMaiores(array, key, meio + 1, right);

        } else {
            count += contarMaiores(array, key, left, meio - 1);
        }
        return count;
    }

    @Override
    public int contarMenores(int[] array, int key) {
        if(array != null && array.length > 0){
            return contarMenores(array, key, 0, array.length - 1);
        }
        return -1;
    }
    private int contarMenores(int[] array, int key, int left, int right){
        if(left > right){
            return 0;
        }
        int count = 0;
        int meio = (left + right)/2;
        if(array[meio] > key){
            count += contarMenores(array, key, left, meio - 1);
        } else{
            count = 1 + contarMenores(array, key, meio + 1, right);
        }
        return count;
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
