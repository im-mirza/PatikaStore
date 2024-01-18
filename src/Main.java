package patikadevstore;

import patikadevstore.controller.BrandController;
import patikadevstore.controller.CategoryController;
import patikadevstore.controller.ProductController;
import patikadevstore.view.PatikaStore;

public class Main {
    public static void main(String[] args) {



        CategoryController categoryController = new CategoryController();
        BrandController brandController = new BrandController();
        ProductController productController = new ProductController(categoryController, brandController);

        PatikaStore patikaStore = new PatikaStore(categoryController, brandController, productController);

        patikaStore.storeMenu();

    }
}