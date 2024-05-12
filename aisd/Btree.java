package itis.aisd;

class Btree {
    public BtreeNode root; // указатель на корневой узел
    public int t; // миинимальная степень


    Btree(int t) {
        this.root = null;
        this.t = t;
    }


    // функция для обхода дерева
    public void traverse()
    {
        if (this.root != null)
            this.root.traverse();
        System.out.println();
    }


    // функция для поиска ключа в этом дереве
    public BtreeNode search(int k)
    {
        if (this.root == null)
            return null;
        else
            return this.root.search(k);
    }

    //функция для вставки элемента
    void insert(int k) {
        if (root == null) {
            root = new BtreeNode(t, true);
            root.keys[0] = k;
            root.n = 1;
        } else {
            if (root.n == 2 * t - 1) {
                BtreeNode s = new BtreeNode(t, false);
                s.C[0] = root;
                s.splitChild(0, root);
                int i = 0;
                if (s.keys[0] < k) {
                    i++;
                }
                s.C[i].insertNonFull(k);
                root = s;
            } else {
                root.insertNonFull(k);
            }
        }
    }

    //функция удаления элемента

    private void Remove(BtreeNode x, int key) {
        int pos = x.find(key);
        if (pos != -1) {
            if (x.leaf) {
                int i = 0;
                for (i = 0; i < x.n && x.keys[i] != key; i++) {
                }
                ;
                for (; i < x.n; i++) {
                    if (i != 2 * t - 2) {
                        x.keys[i] = x.keys[i + 1];
                    }
                }
                x.n--;
                return;
            }
            if (!x.leaf) {

                BtreeNode pred = x.C[pos];
                int predKey = 0;
                if (pred.n >= t) {
                    for (;;) {
                        if (pred.leaf) {
                            //System.out.println(pred.n);
                            predKey = pred.keys[pred.n - 1];
                            break;
                        } else {
                            pred = pred.C[pred.n];
                        }
                    }
                    Remove(pred, predKey);
                    x.keys[pos] = predKey;
                    return;
                }

                BtreeNode nextNode = x.C[pos + 1];
                if (nextNode.n >= t) {
                    int nextKey = nextNode.keys[0];
                    if (!nextNode.leaf) {
                        nextNode = nextNode.C[0];
                        for (;;) {
                            if (nextNode.leaf) {
                                nextKey = nextNode.keys[nextNode.n - 1];
                                break;
                            } else {
                                nextNode = nextNode.C[nextNode.n];
                            }
                        }
                    }
                    Remove(nextNode, nextKey);
                    x.keys[pos] = nextKey;
                    return;
                }

                int temp = pred.n + 1;
                pred.keys[pred.n++] = x.keys[pos];
                for (int i = 0, j = pred.n; i < nextNode.n; i++) {
                    pred.keys[j++] = nextNode.keys[i];
                    pred.n++;
                }
                for (int i = 0; i < nextNode.n + 1; i++) {
                    pred.C[temp++] = nextNode.C[i];
                }

                x.C[pos] = pred;
                for (int i = pos; i < x.n; i++) {
                    if (i != 2 * t - 2) {
                        x.keys[i] = x.keys[i + 1];
                    }
                }
                for (int i = pos + 1; i < x.n + 1; i++) {
                    if (i != 2 * t - 1) {
                        x.C[i] = x.C[i + 1];
                    }
                }
                x.n--;
                if (x.n == 0) {
                    if (x == root) {
                        root = x.C[0];
                    }
                    x = x.C[0];
                }
                Remove(pred, key);
                return;
            }
        } else {
            for (pos = 0; pos < x.n; pos++) {
                if (x.keys[pos] > key) {
                    break;
                }
            }
            BtreeNode tmp = x.C[pos];
            if (tmp.n >= t) {
                Remove(tmp, key);
                return;
            }
            if (true) {
                BtreeNode nb = null;
                int devider = -1;

                if (pos != x.n && x.C[pos + 1].n >= t) {
                    devider = x.keys[pos];
                    nb = x.C[pos + 1];
                    x.keys[pos] = nb.keys[0];
                    tmp.keys[tmp.n++] = devider;
                    tmp.C[tmp.n] = nb.C[0];
                    for (int i = 1; i < nb.n; i++) {
                        nb.keys[i - 1] = nb.keys[i];
                    }
                    for (int i = 1; i <= nb.n; i++) {
                        nb.C[i - 1] = nb.C[i];
                    }
                    nb.n--;
                    Remove(tmp, key);
                    return;
                } else if (pos != 0 && x.C[pos - 1].n >= t) {

                    devider = x.keys[pos - 1];
                    nb = x.C[pos - 1];
                    x.keys[pos - 1] = nb.keys[nb.n - 1];
                    BtreeNode child = nb.C[nb.n];
                    nb.n--;

                    for (int i = tmp.n; i > 0; i--) {
                        tmp.keys[i] = tmp.keys[i - 1];
                    }
                    tmp.keys[0] = devider;
                    for (int i = tmp.n + 1; i > 0; i--) {
                        tmp.C[i] = tmp.C[i - 1];
                    }
                    tmp.C[0] = child;
                    tmp.n++;
                    Remove(tmp, key);
                    return;
                } else {
                    BtreeNode lt = null;
                    BtreeNode rt = null;
                    boolean last = false;
                    if (pos != x.n) {
                        devider = x.keys[pos];
                        lt = x.C[pos];
                        rt = x.C[pos + 1];
                    } else {
                        devider = x.keys[pos - 1];
                        rt = x.C[pos];
                        lt = x.C[pos - 1];
                        last = true;
                        pos--;
                    }
                    for (int i = pos; i < x.n - 1; i++) {
                        x.keys[i] = x.keys[i + 1];
                    }
                    for (int i = pos + 1; i < x.n; i++) {
                        x.C[i] = x.C[i + 1];
                    }
                    x.n--;
                    lt.keys[lt.n++] = devider;

                    for (int i = 0, j = lt.n; i < rt.n + 1; i++, j++) {
                        if (i < rt.n) {
                            lt.keys[j] = rt.keys[i];
                        }
                        lt.C[j] = rt.C[i];
                    }
                    lt.n += rt.n;
                    if (x.n == 0) {
                        if (x == root) {
                            root = x.C[0];
                        }
                        x = x.C[0];
                    }
                    Remove(lt, key);
                    return;
                }
            }
        }
    }

    public void Remove(int key) {
        BtreeNode x = search(key);
        if (x == null) {
            return;
        }
        Remove(root, key);
    }

}