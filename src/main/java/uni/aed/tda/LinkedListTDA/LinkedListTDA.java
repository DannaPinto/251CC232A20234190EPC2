package uni.aed.tda.LinkedListTDA;

import uni.aed.tda.ListTDA.IteratorTDA;
import uni.aed.tda.ListTDA.ListTDA;

public class LinkedListTDA<E> implements ListTDA<E> {
    // Código existente de la clase...

    // Métodos de operaciones de conjuntos (NO estáticos)
    public ListTDA<String> union(ListTDA<String> list2) {
        LinkedListTDA<String> result = new LinkedListTDA<>();
        copiarElementos(this, result);
        copiarElementos(list2, result);
        return result;
    }

    public ListTDA<String> interseccion(ListTDA<String> list2) {
        LinkedListTDA<String> result = new LinkedListTDA<>();
        IteratorTDA<String> it = this.iterador();
        while (it.hasNext()) {
            String elemento = it.next();
            if (list2.contain(elemento))
                result.add(elemento);
        }
        return result;
    }

    public ListTDA<String> diferencia(ListTDA<String> list2) {
        LinkedListTDA<String> result = new LinkedListTDA<>();
        IteratorTDA<String> it = this.iterador();
        while (it.hasNext()) {
            String elemento = it.next();
            if (!list2.contain(elemento))
                result.add(elemento);
        }
        return result;
    }

    private void copiarElementos(ListTDA<String> fuente, ListTDA<String> destino) {
        IteratorTDA<String> it = fuente.iterador();
        while (it.hasNext()) {
            String elemento = it.next();
            if (!destino.contain(elemento))
                destino.add(elemento);
        }
    }
}
