
    public class AntrianKRS {

    Mahasiswa11[] data;

    int front;
    int rear;
    int size;
    int max;

    int sudahDilayani;

    public AntrianKRS(int n) {

        max = n;

        data = new Mahasiswa11[max];

        front = rear = -1;
        size = 0;

        sudahDilayani = 0;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public boolean isFull() {

        return size == max;
    }

    public void clear() {

        front = rear = -1;
        size = 0;

        System.out.println(
                "Antrian berhasil dikosongkan");
    }

    public void enqueue(Mahasiswa11 mhs) {

        if (isFull()) {

            System.out.println("Antrian penuh");

        } else {

            if (isEmpty()) {

                front = rear = 0;

            } else {

                rear = (rear + 1) % max;
            }

            data[rear] = mhs;
            size++;

            System.out.println(
                    mhs.nama
                    + " berhasil masuk antrian");
        }
    }

    public Mahasiswa11 dequeue() {

        if (isEmpty()) {

            System.out.println("Antrian kosong");
            return null;
        }

        Mahasiswa11 mhs = data[front];

        size--;

        if (size == 0) {

            front = rear = -1;

        } else {

            front = (front + 1) % max;
        }

        sudahDilayani++;

        return mhs;
    }

    public void dequeue2() {

        System.out.println(
                "Mahasiswa yang diproses KRS:");

        for (int i = 0; i < 2; i++) {

            Mahasiswa11 mhs = dequeue();

            if (mhs != null) {

                mhs.tampilkanData();
            }
        }
    }

    public void tampilSemua() {

        if (isEmpty()) {

            System.out.println("Antrian kosong");

        } else {

            int i = front;
            int no = 1;

            System.out.println(
                    "Daftar Antrian:");

            while (i != rear) {

                System.out.print(no + ". ");

                data[i].tampilkanData();

                i = (i + 1) % max;
                no++;
            }

            System.out.print(no + ". ");

            data[i].tampilkanData();
        }
    }

    public void tampil2Terdepan() {

        if (!isEmpty()) {

            System.out.println(
                    "2 Antrian Terdepan:");

            int i = front;

            for (int j = 0;
                 j < 2 && j < size;
                 j++) {

                data[i].tampilkanData();

                i = (i + 1) % max;
            }

        } else {

            System.out.println("Antrian kosong");
        }
    }

    public void tampilAkhir() {

        if (!isEmpty()) {

            System.out.println(
                    "Antrian paling belakang:");

            data[rear].tampilkanData();

        } else {

            System.out.println("Antrian kosong");
        }
    }

    public int getJumlahAntrian() {

        return size;
    }

    public int getSudahDilayani() {

        return sudahDilayani;
    }

    public int getBelumDilayani() {

        return 30 - sudahDilayani;
    }
}

