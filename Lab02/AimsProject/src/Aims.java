public class Aims {
    public static void main(String[] args) {
        //Section 12: Create Carts of DVD
        //Tạo Cart mới
        Cart anOrder = new Cart();

        //Tạo dvd mới và Thêm vào Cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "The Lion King",
                "Animation",
                "Roger Allers",
                87,
                19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Star Wars",
                "Science Fiction",
                "George Lucas",
                87,
                24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Animation",
                "Aladin",
                18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        //Tạo thêm 7 dvd
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(
                "Science Fiction",
                "Inception",
                29.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc(
                "The Matrix",
                "Science Fiction",
                "Lana Wachowski",
                136,
                19.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc(
                "Interstellar",
                "Science Fiction",
                "Christopher Nolan",
                169,
                22.99f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc(
                "Animation",
                "Frozen",
                15.99f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc(
                "Toy Story",
                "Animation",
                "John Lasseter",
                81,
                14.99f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc(
                "Avatar",
                "Science Fiction",
                "James Cameron",
                162,
                25.99f);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc(
                "The Avengers",
                "Action",
                "Joss Whedon",
                143,
                20.99f);

        //Section 13: Removing items from the cart
        anOrder.removeDigitalVideoDisc(dvd2);

        //Thêm dvd bằng cách Thêm danh sách các dvd

        //Section 14.1: Thêm dvd bằng cách Truyền số lượng đối số cho dvd
        anOrder.addDigitalVideoDisc(dvd4, dvd5, dvd6, dvd7);

        //Section 14.2:
        anOrder.addDigitalVideoDisc(dvd8, dvd9);
        //Hiển thị đĩa trong giỏ hàng
        anOrder.displayDigitalVideoDisc();

        //In tổng số tiền
        anOrder.totalCost();
    }
}
