/*Name: Muhammad Rafsan Kabir
ID: 2011180042
Section: 14
Group Members: Al-Jubayer Pial 2012972642
               Maqsudul Mahmud Fahim 2011312642
 */
public interface Brands {
    default void selectBrand() {
        System.out.println("Available Mobile Brands: ");
        System.out.println("1.Samsung  2.Apple  3.OnePlus  4.Xiaomi");
        System.out.print("Enter Brand Name: ");
    }

    void availableModel();
}
