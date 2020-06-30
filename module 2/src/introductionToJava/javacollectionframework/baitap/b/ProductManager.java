package introductionToJava.javacollectionframework.baitap.b;



import java.util.*;

public class ProductManager<E> {
    public void addProduct(List<Produce> list) {
        Scanner input = new Scanner(System.in);
        String name;
        int price;
        System.out.println("Enter Name product: ");
        name = input.nextLine();
        System.out.println("Enter Price Product:");
        price = input.nextInt();
        Produce produce = new Produce(name, price);
        list.add(produce);
    }

    public void edit(List<Produce> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (i == id) {
                Scanner input = new Scanner(System.in);
                System.out.println("Input name:");
                String name = input.nextLine();
                System.out.println("input Price:");
                float price = input.nextFloat();
                list.get(i).setName(name);
                list.get(i).setPrice(price);
                break;
            }
        }
    }

    public void delete(List<Produce> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (i == id) {
                list.remove(i);
                break;
            }
        }
    }

    public void show(List<Produce> list) {
        for (Produce produce : list) {
            produce.show();
        }
    }

    public void find(List<Produce> list, String name) {
        for (Produce produce : list) {
            if (produce.getName().equals(name)) {
                produce.show();
                break;
            }
        }
    }

    public void sort(List<Produce> list) {
        int choose;
        System.out.println("Enter 1 or 2 Sort");
        Scanner input = new Scanner(System.in);
        choose = input.nextInt();
        if (choose == 1) {
            Collections.sort(list);
        } else if (choose == 2) {
            Collections.sort(list, new Comparator<Produce>() {
                @Override
                public int compare(Produce produce, Produce t1) {
                    if (produce.getPrice() > t1.getPrice()) {
                        return -1;
                    } else if (produce.getPrice() < t1.getPrice()) {
                        return 1;
                    } else
                        return 0;
                }
            });
        }

    }

    public void menuShow() {
        Scanner input = new Scanner(System.in);
        System.out.println("============Chương Trình Quản Lý Sản Phẩm=================");
        System.out.println("1.Thêm Sản Phẩm  ");
        System.out.println("2.Sửa Sản Phẩm  ");
        System.out.println("3.Xóa Sản Phẩm ");
        System.out.println("4.Hiển Thị Thông Tin Sản Phẩm ");
        System.out.println("5.Tìm Kiếm Sản Phẩm ");
        System.out.println("6.Sắp Xếp Sản Phẩm Theo Giá ");
        System.out.println("7.Exit");
    }

    public static void main(String[] args) {
        int choose;
        ProductManager<Produce> produceProductManager = new ProductManager<Produce>();

        List<Produce> listArr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        produceProductManager.menuShow();
        boolean check = false;
        while (!check) {
            System.out.println("Chọn Chức Năng:");
            choose = input.nextInt();
            switch (choose) {
                case 1: {
                    produceProductManager.addProduct(listArr);
                    produceProductManager.menuShow();
                    break;
                }
                case 2: {
                    int id;
                    System.out.println("Enter Id do u want edit:");
                    id = input.nextInt();
                    produceProductManager.edit(listArr, id);
                    break;
                }
                case 3: {
                    System.out.println("Enter Id Dow u want Dellete:");
                    int id = input.nextInt();
                    produceProductManager.delete(listArr, id);
                    break;
                }
                case 4: {
                    System.out.println("====================Thông Tin Sản Phẩm====================");
                    produceProductManager.show(listArr);
                    break;
                }
                case 5: {
                    String name;
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("Enter Name do u wan find:");
                    name = input1.nextLine();
                    produceProductManager.find(listArr, name);
                    break;
                }
                case 6: {
                    produceProductManager.sort(listArr);
                    break;

                }
                case 7: {
                    System.out.println("Exit");
                    check = true;
                }

            }
        }

    }
}
