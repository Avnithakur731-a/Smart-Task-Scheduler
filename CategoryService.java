public class CategoryService {

    private Category[] categories = new Category[50];
    private int count = 0;

    // Add Category
    public void addCategory(int id, String name) {

        categories[count] = new Category(id, name);
        count++;

        System.out.println("Category Added Successfully");
    }

    // Display Categories
    public void displayCategories() {

        if (count == 0) {
            System.out.println("No Categories Found");
            return;
        }

        for (int i = 0; i < count; i++) {

            System.out.println("--------------------");
            System.out.println("Category ID : " + categories[i].getCategoryId());
            System.out.println("Category Name : " + categories[i].getCategoryName());
        }
    }

    // Search Category
    public Category searchCategory(int id) {

        for (int i = 0; i < count; i++) {

            if (categories[i].getCategoryId() == id) {
                return categories[i];
            }
        }

        return null;
    }
}