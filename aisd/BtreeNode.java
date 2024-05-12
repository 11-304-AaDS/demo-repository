package itis.aisd;

class BtreeNode {
    int[] keys; // ключи вершины
    int t; // минимальная степень (определяет диапазон для количества ключей)
    BtreeNode[] C; // массив дочерних указателей
    int n; // текущее количество ключей
    boolean leaf; // Имеет значение true, если вершина является листом.
    // В противном случае значение false


    BtreeNode(int t, boolean leaf) {
        this.t = t;
        this.leaf = leaf;
        this.n = 0;
        this.keys = new int[2 * t - 1]; //все вершины могут содержать не более (2*t – 1) ключей.
        this.C = new BtreeNode[2 * t]; //количество дочерних вершин у вершины равно
        //количеству ключей в нем плюс 1.
    }

    // функция для обхода всех вершин поддерева
    public void traverse() {
        int i = 0;
        for (i = 0; i < this.n; i++) {
            if (this.leaf == false) {
                C[i].traverse();
            }
            System.out.print(keys[i] + " ");
        }
        if (leaf == false)
            C[i].traverse();
    }

    public int find (int k) {
        for (int i = 0; i < this.n; i++) {
            if (this.keys[i] == k) {
                return i;
            }
        }
        return -1;
    };

    // функция для поиска ключа в поддереве, корень которого находится в
    // этой вершине.

    public BtreeNode search(int k) { // // возвращает значение null, если значение k отсутствует.
        int i = 0;
        while (i < n && k > keys[i])
            i++;

        if (keys[i] == k)
            return this;

        if (leaf == true)
            return null;

        return C[i].search(k);
    }
    


    //вставляет элемент в дерево, если не достигнуто максимального кол-ва ключей
    void insertNonFull(int k) {
        int i = n - 1;
        if (leaf) {
            while (i >= 0 && keys[i] > k) {
                keys[i + 1] = keys[i];
                i--;
            }
            keys[i + 1] = k;
            n++;
        } else {
            while (i >= 0 && keys[i] > k) {
                i--;
            }
            if (C[i + 1].n == 2 * t - 1) {
                splitChild(i + 1, C[i + 1]);
                if (keys[i + 1] < k) {
                    i++;
                }
            }
            C[i + 1].insertNonFull(k);
        }
    }

    //разделение дочерней вершины для освобождения места
    void splitChild(int i, BtreeNode y) {
        BtreeNode z = new BtreeNode(y.t, y.leaf);
        z.n = t - 1;
        for (int j = 0; j < t - 1; j++) {
            z.keys[j] = y.keys[j + t];
        }
        if (!y.leaf) {
            for (int j = 0; j < t; j++) {
                z.C[j] = y.C[j + t];
            }
        }
        y.n = t - 1;
        for (int j = n; j > i; j--) {
            C[j + 1] = C[j];
        }
        C[i + 1] = z;
        for (int j = n - 1; j >= i; j--) {
            keys[j + 1] = keys[j];
        }
        keys[i] = y.keys[t - 1];
        n++;
    }
}