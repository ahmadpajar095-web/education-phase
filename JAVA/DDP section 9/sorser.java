
import java.util.Arrays;

public class Sorser {
    public static void main(String[] args) {

    // =============================
    // 1) SELECTION SORT (ASCENDING)
    // =============================
    /*
     * Ide: untuk tiap posisi i, cari nilai minimum dari subarray [i..akhir],
    * lalu tukar ke posisi i. Memori ekstra sangat kecil (in-place).
    * Kompleksitas: O(n^2) karena ada dua loop bersarang.
    */
   static void selectionSort(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
           int minIndex = i; // indeks nilai minimum pada rentang [i..akhir]
            for (int j = i + 1; j < arr.length; j++) {-
                // Jika ditemukan nilai lebih kecil, perbarui minIndex
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Tukar arr[i] dengan arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    int[] a1 = {40, 7, 59, 4, 1};
    print("Awal a1: ", a1);
    selectionSort(a1);
    print("Setelah Selection Sort: ", a1);
    
    // ==========================
    // 2) BUBBLE SORT (ASCENDING)
    // ==========================
    /*
     * Ide: bandingkan pasangan bertetangga (j dan j+1),
     * tukar jika salah urut. Ulangi beberapa "pass".
     * Kompleksitas: O(n^2) pada rata-rata/terburuk.
     */
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Setiap pass akan "menggeser" elemen terbesar ke ujung kanan
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar jika urutan salah (descending di kiri, ascending di kanan)
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }  
            }
        }
    }

    // -----------------------------
    // 2b) BUBBLE SORT - OPTIMIZED
    // -----------------------------
    /*
     * Optimasi: jika dalam satu pass tidak ada swap,
     * berarti array sudah terurut -> hentikan lebih awal.
     */
    static void bubbleSortOptimized(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false; // penanda apakah terjadi pertukaran
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
            if (!swapped) {
                // Tidak ada pertukaran pada pass ini -> sudah terurut
                return;
            }
        }
    }

    // ==============================
    // 3) SEQUENTIAL/LINEAR SEARCH
    // ==============================
    /*
     * Ide: cek satu per satu dari indeks 0 sampai akhir,
     * berhenti saat ketemu. Bekerja untuk data terurut maupun tidak.
     * Kompleksitas: O(n).
     * Mengembalikan indeks jika ketemu, -1 jika tidak.
     */
    static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            // Bandingkan elemen saat ini dengan target
            if (arr[i] == target) {
                return i; // ketemu, kembalikan posisi
            }
        }
        return -1; // tidak ketemu
    }

    // ======================
    // 4) BINARY SEARCH (ASC)
    // ======================
    /*
     * Syarat: arr harus SUDAH TERURUT (ascending).
     * Ide: cek elemen tengah, sempitkan rentang [low..high]
     * ke kiri atau ke kanan berdasarkan perbandingan.
     * Kompleksitas: O(log n).
     * Mengembalikan indeks jika ketemu, -1 jika tidak.
     */
    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            // Hindari overflow: gunakan low + (high - low)/2
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // ketemu di tengah
            } else if (arr[mid] < target) {
                // target lebih besar -> geser ke kanan
                low = mid + 1;
            } else {
                // target lebih kecil -> geser ke kiri
                high = mid - 1;
            }
        }
        // Rentang habis -> tidak ketemu
        return -1;
    }

    // ================
    // Fungsi utilitas
    // ================
    static void print(String label, int[] arr) {
        System.out.println(label + Arrays.toString(arr));
    }

    // =========
    // DEMO MAIN
    // =========

        // -------------------------
        // Demo Selection Sort (ASC)
        // -------------------------

        // ----------------------
        // Demo Bubble Sort (ASC)
        // ----------------------
        int[] a2 = {40, 7, 59, 4, 1};
        print("Awal a2: ", a2);
        bubbleSortOptimized(a2); // pakai versi optimized
        print("Setelah Bubble Sort (optimized): ", a2);

        // -----------------------------------
        // Demo Sequential (Linear) Search
        // -----------------------------------
        int idxSeq = sequentialSearch(a2, 7); // bisa di array terurut/tidak terurut
        System.out.println("Sequential Search 7 -> indeks: " + idxSeq); // contoh: 1

        // -------------------
        // Demo Binary Search
        // -------------------
        // Catatan: binarySearch harus pada data terurut. a2 sudah terurut dari bubble sort.
        int idxBin = binarySearch(a2, 7);
        System.out.println("Binary Search 7 -> indeks: " + idxBin);

        // -------------------------------
        // Contoh SALAH untuk Binary Search
        // -------------------------------
        int[] notSorted = {5, 10, 1, 9, 2}; // tidak terurut
        int wrong = binarySearch(notSorted, 9);
        System.out.println("Binary Search pada array TIDAK TERURUT -> hasil tidak valid: " + wrong);
        // Perbaikan yang benar:
        Arrays.sort(notSorted);
        int fixed = binarySearch(notSorted, 9);
        System.out.println("Binary Search setelah di-sort -> indeks: " + fixed);
       }
