public class Cart {
    // Section 11: Create Cart class
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    //Thêm đĩa vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("\nAdded " + disc.getTitle() + " in cart.");
            System.out.println("There are " + qtyOrdered + " items ordered.");
            System.out.println("You can add " + (MAX_NUMBERS_ORDERED - qtyOrdered) + " items to the cart.");
        } else {
            System.out.println("The cart is almost full.\n");
        }
    }

    //Xóa đĩa khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("\nRemoved " + disc.getTitle() + " from cart.");
                System.out.println("There are " + qtyOrdered + " disc in cart.\n");
            }
        }
    }
    //Hiển thị đĩa có trong giỏ hàng
    public void displayDigitalVideoDisc() {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null) {
                System.out.println(String.format("%d.\t%-20s%.2f",
                        (i+1),
                        itemsOrdered[i].getTitle(),
                        itemsOrdered[i].getCost()));
            }
        }
    }
    //Tính giá tiền
    public void totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        System.out.println("-----------------------------");
        System.out.println(String.format("  \t%-20s%.2f","Total", total));
    }

    //Section 14:
    //Section 14.1:
    /*public void addDVD (DigitalVideoDisc [] dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
                System.out.println("\nAdded " + dvdList[i].getTitle() + " in cart.");
                System.out.println("There are " + qtyOrdered + " items ordered.");
            } else {
                System.out.println("The cart is almost full.\n");
            }
        }
    }*/
    public void addDigitalVideoDisc (DigitalVideoDisc ... dvds) {
        for (int i = 0; i < dvds.length; i++) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = dvds[i];
                qtyOrdered++;
                System.out.println("\nAdded " + dvds[i].getTitle() + " in cart.");
                System.out.println("There are " + qtyOrdered + " items ordered.");
            } else {
                System.out.println("The cart is almost full.\n");
            }
        }
    }
    //Section 14.2:
    public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("\nAdded " + dvd1.getTitle() + " in cart.");
            System.out.println("There are " + qtyOrdered + " items ordered.");
        }
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("\nAdded " + dvd2.getTitle() + " in cart.");
            System.out.println("There are " + qtyOrdered + " items ordered.");
        }
    }
}