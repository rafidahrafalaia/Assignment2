import java.util.Scanner;

public class tree {
    static Scanner input = new Scanner(System.in);
    public void insert(node objNode, int nilai){
        if (nilai < objNode.value){
            if (objNode.left != null){
                insert(objNode.left, nilai);
            }else{
                objNode.left = new node();
                objNode.left.input(nilai);
                System.out.println(nilai + " Di Kiri " + objNode.value);
//                System.out.println("Kiri" + objNode.value);
            }
        }else if(nilai > objNode.value){
            if (objNode.right != null){
                insert(objNode.right, nilai);
            }else{
                objNode.right = new node();
                objNode.right.input(nilai);
                System.out.println(nilai + " Di Kanan " + objNode.value);
            }
        }
    }

    public void view (node a){
        System.out.print("1.Pre Order\n2.In Order\n3.Post Order\nMasukkan Order Yang Diinginkan: ");
        int order=input.nextInt();
        switch (order){
            case 1:
                System.out.print("Pre Order : ");
                preOrder(a);
                break;
            case 2:
                System.out.println("In order:");
                InOrder(a);
                break;
            case 3:
                System.out.println("Post order:");
                PostOrder(a);
                break;
            default:
                System.out.println("Input yang dimasukkan salah!");
        }
        System.out.println(" ");
    }

    public void preOrder(node objNode){
        if (objNode !=null){
            System.out.print(objNode.value + "----");
            preOrder(objNode.left);
            preOrder(objNode.right);
        }else{
            System.out.print("is null!"); // Bakalan ke print 3 kali objtNode.right
            // karena sesuai dengan pemanggilan dari banyak nya obj node left
        }
    }
    public void InOrder(node objNode){
        if (objNode !=null){
            preOrder(objNode.left);
            System.out.print(objNode.value + "----");
            preOrder(objNode.right);
        }else{
            System.out.print("is null!"); // Bakalan ke print 3 kali objtNode.right
            // karena sesuai dengan pemanggilan dari banyak nya obj node left
        }
    }
    public void PostOrder(node objNode){
        if (objNode !=null){
            preOrder(objNode.left);
            preOrder(objNode.right);
            System.out.print(objNode.value + "----");
        }else{
            System.out.print("is null!"); // Bakalan ke print 3 kali objtNode.right
            // karena sesuai dengan pemanggilan dari banyak nya obj node left
        }
    }
}

class node{
    node left, right;
    int value;

    public void input (int a){
        value = a;
    }

    public static void main (String [] args){
        int menu = 1;
        int r = 1;
        int a;

        tree tree = new tree();
        node root = new node();

        while (menu != 3){
            System.out.print(
                    "1. Input \n2. View \n3. Exit \nApa Yang Ingin Anda Pilih: "
            );
            menu = tree.input.nextInt();
            if (menu==1){
                System.out.print("Masukkan Angka : ");
                a = tree.input.nextInt();
                if (r==1){
                    root.input(a);
                    r--;
                }else{
                    tree.insert(root,a);
                }
            }else if(menu==2){
                tree.view(root);
            }else if(menu==3){
                System.out.println("Keluar");
            }else {
                System.out.println("Pilihan Tidak Valid");
            }
            System.out.println(" ");
        }
    }
}