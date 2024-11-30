/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalass;



/**
 *
 * @author 27cv
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class MainMenu {
    //private ShoppingCart cart;//
    private ItemSearch itemSearch;//add item search
    private OrderHistory orderHistory;
    private OrderHistory orderHistory1;
    private CheckOut checkout;
    //private ShoppingCart cart1;
    //private Order order = new Order();
    private Product[] cpu = new Product[100];
    private Product[] gpu = new Product[100];
    private Product[] ram = new Product[100];
    private Product[] ssd = new Product[100];
    private Product[] psu = new Product[100];
    private Product[] mboard = new Product[100];
    private Product[] ccase = new Product[100];
    private Product[] monitor = new Product[100];
    Scanner input = new Scanner(System.in);
    private ArrayList<Product[]> allProduct = new ArrayList<>();

    public MainMenu( ) { //maybe
            //this.cart = cart; // Now this class has the same cart
            //this.cart1 = cart1;
            this.itemSearch= new ItemSearch();
            //this.orderHistory = orderHistory;
            //this.orderHistory1 = orderHistory1;
            // Define products
            // CPU(s)
            cpu[0] = new Product(1, "Ryzen 5", 500.00);
            cpu[1] = new Product(2, "Ryzen 7", 700.00);
            cpu[2] = new Product(3, "Ryzen 9", 900.00);
            cpu[3] = new Product(4, "Intel 3", 330.000);
            cpu[4] = new Product(5, "Intel 5", 550.00);
            cpu[5] = new Product(6, "Intel 7", 770.00);
            cpu[6] = new Product(7, "Intel 9", 990.00);
            cpu[7] = new Product(8, "Ryzen 5 (Special Edition)", 870.60);
            cpu[8] = new Product(9, "Ryzen 7 (Special Edition", 1350.50);
            cpu[9] = new Product(10, "Ryzen 9 (Special Edition)", 1599.90);


            // GPU(s)
            //Product[] gpu = new Product[100];
            gpu[0] = new Product(11, "GTX 1060", 1354.00);
            gpu[1] = new Product(12, "GTX 1080", 2260.00);
            gpu[2] = new Product(13, "RTX 2060s", 2038.00);
            gpu[3] = new Product(14, "RTX 2070", 2713.00);
            gpu[4] = new Product(15, "RTX 3050", 1102.00);
            gpu[5] = new Product(16, "RTX 3060ti", 1268.00);
            gpu[6] = new Product(17, "RTX 3070", 2149.00);
            gpu[7] = new Product(18, "RTX 3090", 4530.00);
            gpu[8] = new Product(19, "RTX 4060", 1359.00);
            gpu[9] = new Product(20, "RTX 4070", 2537.00);
            gpu[10] = new Product(21, "RTX 4080s", 4348.00);
            gpu[11] = new Product(22, "RTX 4090", 7899.00);
            gpu[12] = new Product(23, "RX 580", 573.00);
            gpu[13] = new Product(24, "RX 5600XT", 2523.00);
            gpu[14] = new Product(25, "RX 6400", 450.00);
            gpu[15] = new Product(26, "RX 6500XT", 634.00);
            gpu[16] = new Product(27, "RX 6600", 988.00);
            gpu[17] = new Product(28, "RX 6750XT", 3249.00);
            gpu[18] = new Product(29, "RX6800", 5232.00);
            gpu[19] = new Product(30, "RX 6800XT", 5788.00);

            // RAM(s)
            //Product[] ram = new Product[100];
            ram[0] = new Product(31, "Corsair Vengeance LPX DDR4 3200 C16 2x8GB", 190.00);
            ram[1] = new Product(35, "Corsair Vengeance DDR5 5600 C36 2x16GB", 516.00);
            ram[2] = new Product(33, "Corsair Vengeance LPX DDR4 3000 C15 2x8GB", 190.00);
            ram[3] = new Product(34, "G.SKILL TZ/RJ/FX DDR5 6400 C36 2x16GB", 476.00);
            ram[4] = new Product(32, "G.SKILL TZ/RJ/FX DDR5 6000 C30 2x16GB", 453.00);
            ram[5] = new Product(36, "G.SKILL TZ/RJ/FL DDR5 6000 C32 2x16GB", 430.00);
            ram[6] = new Product(37, "ADATA XPG SPECTRIX D60G DDR4 32GB (16*2) 3200Mhz", 473.00);
            ram[7] = new Product(38, "ADATA XPG SPECTRIX D41 GRAY RGB LED DDR4 3200MHZ 8GB", 472.00);
            ram[8] = new Product(39, "Kingston Fury DDR5 5600 C40 2x8GB", 292.00);
            ram[9] = new Product(40, "Kingston Fury DDR5 5600 C40 2x16GB", 430.00);

            // SSD(s)
            //Product[] ssd = new Product[100];
            ssd[0] = new Product(41, "WD Black SN850X M.2 2TB", 660.00);
            ssd[1] = new Product(42, "WD Black SN850X M.2 1TB", 362.00);
            ssd[2] = new Product(43, "WD Black SN850X M.2 4TB", 1327.00);
            ssd[3] = new Product(44, "Samsung 990 Pro M.2 2TB", 702.00);
            ssd[4] = new Product(45, "Samsung 990 Pro M.2 4TB", 1259.00);
            ssd[5] = new Product(46, "Samsung 990 Pro M.2 1TB", 508.00);
            ssd[6] = new Product(47, "Crucial T700 M.2 4TB", 1676.00);
            ssd[7] = new Product(48, "Crucial T705 M.2 2TB", 1200.00);
            ssd[8] = new Product(49, "Crucial T705 M.2 1TB", 846.00);
            ssd[9] = new Product(50, "Crucial T700 M.2 2TB", 1237.00);

            // PSU(s)
            //Product[] psu = new Product[100];
            psu[0] = new Product(51, "CORSAIR CX SERIES MODULAR CX500M ATX PSU 500 WATT 80 PLUS", 259.99);
            psu[1] = new Product(52, "HP 300W ACTIVE PFC ATX POWER SUPPLY UNIT", 189.99);
            psu[2] = new Product(53, "1st Player DK PREMIUM 80 Plus Bronze Non Modular PSU", 183.00);
            psu[3] = new Product(54, "Gigabyte P650G 80PLUS Gold Power Supply (650W) PC PSU", 285.00);
            psu[4] = new Product(55, "AVF Extreme Power 650W Power Supply", 75.00);
            psu[5] = new Product(56, "COOLER MASTER CM ELITE V3 230V PK500W PSU POWER SUPPLY", 167.00);
            psu[6] = new Product(57, "Asus ROG Thor 1000W Platinum II OLED Aura Sync Heatsinks PSU", 1749.00);
            psu[7] = new Product(58, "Salpido Professional Power Supply ATX 500W", 45.00);
            psu[8] = new Product(59, "Thermaltake LitePower 450W", 129.00);
            psu[9] = new Product(60, "Seasonic FOCUS GX Series 80+ Gold Full Modular Power Supply - 1000w", 775.00);

            // Motherboard(s)       
            //Product[] mboard = new Product[100];
            mboard[0] = new Product(61, "GIGABYTE H610M H V2 / GIGABYTE H610M K", 335.00);
            mboard[1] = new Product(62, "MSI A520M-A PRO Micro ATX AM4 Motherboard Ryzen Processors Combo", 225.00);
            mboard[2] = new Product(63, "ASUS TUF GAMING B550M-PLUS WIFI II Aura Sync RGB Gaming Motherboard", 649.00);
            mboard[3] = new Product(64, "MACHINIST H81M-PRO S1 Motherboard LGA 1150 NVME M.2 Slot", 153.38);
            mboard[4] = new Product(65, "MUCAI X99 P4 Motherboard LGA 2011-3 ", 185.61);

            // Computer Case(s)
            //Product[] ccase = new Product[100];
            ccase[0] = new Product(66, "Armaggeddon Aquaron Pro Series ATX / M-ATX Transparent view PC Case", 109.00);
            ccase[1] = new Product(67, "Invasion D-7000 Tempered Glass M-ATX Gaming Case - Black/White", 169.00);
            ccase[2] = new Product(68, "Fractal Design North Series Mid Tower Airflow PC Case", 635.00);
            ccase[3] = new Product(69, "Jonsbo Z20 Portable Computer Case MATX Mini-ITX Chassis ", 439.00);
            ccase[4] = new Product(70, "Corsair 3500X Series E-ATX Mid-Tower PC Case - Black/White", 329.00);

            // Monitor(s)
            //Product[] monitor = new Product[100];
            monitor[0] = new Product(71, "EXPOSE PC Monitor 4k 27 Inch ips Curved Monitor Gaming 75HZ", 230.00);
            monitor[1] = new Product(72, "SAMSUNG GAMING MONITOR ODYSSEY G3 27\"/24\" ", 519.00);
            monitor[2] = new Product(73, "Armaggeddon 24\" 100Hz 5Ms Built In Speaker Frameless Gaming Monitor", 319.00);
            monitor[3] = new Product(74, "Cooler Master GA2701 Display Monitor (27\", IPS, Full HD, 100Hz, 1ms)", 526.90);
            monitor[4] = new Product(75, "ViewSonic VX2758A-2K-PRO-3 27\" QHD IPS Gaming Monitor", 1099.00);
            monitor[5] = new Product(76, "Xiaomi Mini LED Gaming Monitor G Pro 27i | 2K 180Hz", 1599.00);
            monitor[6] = new Product(77, "PRISM+ F245i 24.5” 180Hz 1ms Fast IPS 120% sRGB Gaming Monitor [1920 x 1080]", 669.00);
            monitor[7] = new Product(78, "AOC 27G4 27\" FHD IPS 180Hz Gaming Monitor)", 642.00);
            monitor[8] = new Product(79, "Asus TUF Gaming VG34VQL3A 34'' WQHD 180HZ 1MS FREESYNC DisplayHDR 400 VA Curved", 1890.00);
            monitor[9] = new Product(80, "MSI MAG401QR Gaming Monitor - 40\", UWQHD, IPS, 1ms, 155Hz, VESA DisplayHDR 400", 1998.00);

            setAllProduct();
        };

    
    public Order displayMenu(ArrayList<Product[]> allProduct, Order order, SystemManager manager) {    
        Scanner scanner = new Scanner(System.in);      
        updateAllProduct(allProduct);
        Order newOrder = new Order();
        // Define shopping cart // here bro
        //ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nCategories:");
            System.out.println("1. CPU");
            System.out.println("2. GPU");
            System.out.println("3. M.board");
            System.out.println("4. RAM");
            System.out.println("5. SSD");
            System.out.println("6. PSU");
            System.out.println("7. Case");
            System.out.println("8. Monitor");
            System.out.println("9. Search");
            System.out.println("10. Exit");

            System.out.print("Select a category (1-9): ");
            int categoryChoice = scanner.nextInt();

            Product[] selectedCategory = null;

            switch (categoryChoice) {
                case 1: selectedCategory = cpu; break;
                case 2: selectedCategory = gpu; break;
                case 3: selectedCategory = mboard; break;
                case 4: selectedCategory = ram; break;
                case 5: selectedCategory = ssd; break;
                case 6: selectedCategory = psu; break;
                case 7: selectedCategory = ccase; break;
                case 8: selectedCategory = monitor; break;
                case 9: 
                    performProductSearch(itemSearch, cpu, gpu, ram, ssd, psu, ccase, monitor);
                    break;
                case 10:
                    System.out.println("Exiting...");
                    return order;
                default:
                    System.out.println("Invalid choice. Please select a valid category.");
                    continue;
            }

            // check selectedCategory is empty or not
                if (selectedCategory == null) {

                continue; // jump next
            }

            while (true) {
                System.out.println("\nProducts:");
                for (Product product : selectedCategory) {
                    if (product != null) {
                    System.out.printf("%d. %s - RM %.2f\n", product.getId(), product.getName(), product.getPrice());
                    }   
                }
                System.out.println("\nEnter product ID to add to cart, 'view' to view cart, 'remove' to remove an item, 'checkout' to finish, or 'back' to choose another category: ");

                String input = scanner.next();

                if (input.equalsIgnoreCase("back")) {
                    break;
                } else if (input.equalsIgnoreCase("view")) {
                    newOrder.getCart().viewCartContent();
                } else if (input.equalsIgnoreCase("remove")) {
                    System.out.println("");
                    System.out.print("Enter the product ID to remove: ");
                    int productId = scanner.nextInt();
                    newOrder.getCart().removeItem(productId);
                } else if (input.equalsIgnoreCase("checkout")) {
                    System.out.println("Checking out...");
                    displayFinalCart(newOrder.getCart());
                    checkout = new CheckOut(newOrder.getCart(), manager); //orderHistory
                    checkout = checkout.processCheckout(checkout);
                    newOrder.setCheckout(checkout);
                    newOrder.setNewAllCheckout(checkout);
                    order = newOrder;
                    //newOrder.getCart().clearItem(); //clear this purchase cart and return the newOrder back to manager
                    return order;// Exit the program after checkout
                } else {
                    try {
                        int productId = Integer.parseInt(input);
                        Product product = null;
                        for (Product p : selectedCategory) {
                            if (p != null && p.getId() == productId) {
                                product = p;
                                break;
                            }
                        }

                        if (product == null) {
                            System.out.println("Invalid product ID. Please try again.");
                            continue;
                        }

                        int quantity = getValidQuantity(scanner);
                        if (quantity > 0) {
                            newOrder.getCart().addItem(product, quantity);
                            //cart.addItem(product, quantity);
                            //cart1.addItem(product, quantity);
                            //orderHistory.addItem(product, quantity);
                            //orderHistory1.addItem(product, quantity);

                            System.out.println(quantity + " " + product.getName() + "(s) added to the cart.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid product ID. Please enter a valid product ID or command.");
                    }
                }
            }
        }
    }

    public void displayAllProduct(ArrayList<Product[]> allProduct){
        Product[] cpu = allProduct.get(0);
        Product[] gpu = allProduct.get(1);
        Product[] ram = allProduct.get(2);
        Product[] ssd = allProduct.get(3);
        Product[] psu = allProduct.get(4);
        Product[] mboard = allProduct.get(5);
        Product[] ccase = allProduct.get(6);
        Product[] monitor = allProduct.get(7);
        
        boolean continueDisplayItem = true;
        do{
            System.out.println("\nCategories:");
            System.out.println("1. CPU");
            System.out.println("2. GPU");
            System.out.println("3. M.board");
            System.out.println("4. RAM");
            System.out.println("5. SSD");
            System.out.println("6. PSU");
            System.out.println("7. Case");
            System.out.println("8. Monitor");
            System.out.println("9. Exit");

            System.out.print("Select a category (1-9): ");
            int categoryChoice = input.nextInt();

            Product[] selectedCategory = null;

            switch (categoryChoice) {
                case 1: selectedCategory = cpu; break;
                case 2: selectedCategory = gpu; break;
                case 3: selectedCategory = mboard; break;
                case 4: selectedCategory = ram; break;
                case 5: selectedCategory = ssd; break;
                case 6: selectedCategory = psu; break;
                case 7: selectedCategory = ccase; break;
                case 8: selectedCategory = monitor; break;
                case 9:
                    System.out.println("Exiting...");
                    continueDisplayItem = false;
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid category.");
                    break;
            }
            
            System.out.println("\nProducts:");
            for (Product product : selectedCategory) {
                if (product != null) {
                System.out.printf("%d. %s - RM %.2f\n", product.getId(), product.getName(), product.getPrice());
                }   
            }
            
        }while(continueDisplayItem);
        
            
            
    }
    
    public ArrayList updateProductDetails(ArrayList<Product[]> allProduct){
        Product[] cpu = allProduct.get(0);
        Product[] gpu = allProduct.get(1);
        Product[] ram = allProduct.get(2);
        Product[] ssd = allProduct.get(3);
        Product[] psu = allProduct.get(4);
        Product[] mboard = allProduct.get(5);
        Product[] ccase = allProduct.get(6);
        Product[] monitor = allProduct.get(7);
        
         System.out.println("\nCategories:");
        System.out.println("1. CPU");
        System.out.println("2. GPU");
        System.out.println("3. M.board");
        System.out.println("4. RAM");
        System.out.println("5. SSD");
        System.out.println("6. PSU");
        System.out.println("7. Case");
        System.out.println("8. Monitor");
        System.out.print("Select a category (1-9): ");
        int categoryChoice = input.nextInt();

        Product[] selectedCategory = null;

        switch (categoryChoice) {
            case 1: selectedCategory = cpu; break;
            case 2: selectedCategory = gpu; break;
            case 3: selectedCategory = mboard; break;
            case 4: selectedCategory = ram; break;
            case 5: selectedCategory = ssd; break;
            case 6: selectedCategory = psu; break;
            case 7: selectedCategory = ccase; break;
            case 8: selectedCategory = monitor; break;
            case 9:
                System.out.println("Exiting...");   
                break;
            default:
                System.out.println("Invalid choice. Please select a valid category.");
                break;
        }
        
        input.nextLine();
        System.out.println("\nProducts:");
        for (Product product : selectedCategory) {
            if (product != null) {
            System.out.printf("%d. %s - RM %.2f\n", product.getId(), product.getName(), product.getPrice());
            }   
        }
        
        System.out.println("which product you want to update price?");
        System.out.print("Enter your selection :");
        String answer = input.next();
        try {
            int productId = Integer.parseInt(answer);
            Product product = null;
            for (Product p : selectedCategory) {
                if (p != null && p.getId() == productId) {
                    product = p;
                    break;
                }
            }

            if (product == null) {
                System.out.println("Invalid product ID. Please try again.");
                //continue;
            }

            System.out.print("\n\nEnter the new price : RM");
            double price = input.nextDouble();
            if (price > 0) {
                product.setPrice(price);
                System.out.println("Product = " + product.getName() + "New Price = RM " + product.getPrice() + "\nnew price updated.");
            }else{
                System.out.println("price remain unchange.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid product ID. Please enter a valid product ID or command.");
        }
        
        allProduct = reasembleAllProduct(cpu, gpu, ram, ssd, psu, mboard, ccase,monitor);
      
        return allProduct;
    }
    
    // Method to get a valid quantity from the user
    private static int getValidQuantity(Scanner scanner) {
        int quantity = 0;
        while (true) {
            System.out.print("Enter quantity: ");
            try {
                quantity = scanner.nextInt();

                if (quantity > 0) {
                    break;
                } else {
                    System.out.println("Quantity must be a positive number. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        return quantity;
    }

    // Method to display final cart content and total price
    private static void displayFinalCart(ShoppingCart cart) {
        System.out.println("\nFinal cart content:");
        cart.viewCartContent();
    }

    // Search function
    private void performProductSearch(ItemSearch itemSearch, Product[] cpu, Product[] gpu, Product[] ram, Product[] ssd, Product[] psu, Product[] ccase, Product[] monitor) {
        Scanner scanner = new Scanner(System.in);


        //int searchOption = scanner.nextInt();
        //scanner.nextLine(); // clear the input buffer
        boolean searchDone = true;
        do{
            boolean searchTypeCorrect;
            int searchType = 0;
            do{

                try{
                    searchTypeCorrect = true;
                    System.out.println("1. Search by name");
                    System.out.println("2. Search by price and type");
                    System.out.print("Choose search option: ");
                    searchType = input.nextInt();   
                }catch(Exception e){
                    System.out.println("invalid search type. Please try again.");
                    searchTypeCorrect = false;
                    input = new Scanner(System.in);
                    searchType = 0;
                }
            }while(searchTypeCorrect != true);

            switch (searchType) {
                case 1:
                    System.out.print("Enter the product name to search: ");
                    String nameKeyword = scanner.nextLine();
                    ArrayList<Product> foundByName = new ArrayList<>();
                    foundByName.addAll(itemSearch.searchByName(cpu, nameKeyword));
                    foundByName.addAll(itemSearch.searchByName(gpu, nameKeyword));
                    foundByName.addAll(itemSearch.searchByName(ram, nameKeyword));
                    foundByName.addAll(itemSearch.searchByName(ssd, nameKeyword));
                    foundByName.addAll(itemSearch.searchByName(psu, nameKeyword));
                    foundByName.addAll(itemSearch.searchByName(ccase, nameKeyword));
                    foundByName.addAll(itemSearch.searchByName(monitor, nameKeyword));
                    displaySearchResults(foundByName);

                    break;
                case 2:
                    System.out.print("Enter minimum price: ");
                    double minPrice = scanner.nextDouble();
                    System.out.print("Enter maximum price: ");
                    double maxPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter product type (e.g., 'CPU', 'GPU', 'RAM'): ");
                    String type = scanner.nextLine().trim().toUpperCase();
                    ArrayList<Product> foundByCriteria = new ArrayList<>();
                    if (type.equalsIgnoreCase("CPU")) {
                        foundByCriteria.addAll(itemSearch.searchByCriteria(cpu, minPrice, maxPrice));
                    } else if (type.equalsIgnoreCase("GPU")) {
                        foundByCriteria.addAll(itemSearch.searchByCriteria(gpu, minPrice, maxPrice));
                    } else if (type.equalsIgnoreCase("RAM")) {
                        foundByCriteria.addAll(itemSearch.searchByCriteria(ram, minPrice, maxPrice));
                    } else if (type.equalsIgnoreCase("SSD")) {
                        foundByCriteria.addAll(itemSearch.searchByCriteria(ssd, minPrice, maxPrice));
                    } else if (type.equalsIgnoreCase("PSU")) {
                        foundByCriteria.addAll(itemSearch.searchByCriteria(psu, minPrice, maxPrice));
                    } else if (type.equalsIgnoreCase("CASE")) {
                        foundByCriteria.addAll(itemSearch.searchByCriteria(ccase, minPrice, maxPrice));
                    } else if (type.equalsIgnoreCase("MONITOR")) {
                        foundByCriteria.addAll(itemSearch.searchByCriteria(monitor, minPrice, maxPrice));
                    } else {
                        System.out.println("Invalid product type.");
                    }
                    displaySearchResults(foundByCriteria);
                    break;
                default:
                    System.out.println("Invalid search option.");
                    searchDone = false;
                    break;     
            }
        }while(searchDone = false);


    }

    // Display search results
    private void displaySearchResults(ArrayList<Product> products) {
        if (products.isEmpty()) {
            System.out.println("No products found matching your criteria.");
        } else {
            System.out.println("\nSearch Results:");
            for (Product product : products) {
                System.out.printf("%d. %s - RM %.2f\n", product.getId(), product.getName(), product.getPrice());
            }
        }
    }

    
    public Product[] getCpu() {
        return cpu;
    }

    public void setCpu(ArrayList<Product[]> allProduct) {
        this.cpu = allProduct.get(0);
    }

    public Product[] getGpu() {
        return gpu;
    }

    public void setGpu(ArrayList<Product[]> allProduct) {
        this.gpu = allProduct.get(1);
    }

    public Product[] getRam() {
        return ram;
    }

    public void setRam(ArrayList<Product[]> allProduct) {
        this.ram = allProduct.get(2);
    }

    public Product[] getSsd() {
        return ssd;
    }

    public void setSsd(ArrayList<Product[]> allProduct) {
        this.ssd = allProduct.get(3);
    }

    public Product[] getPsu() {
        return psu;
    }

    public void setPsu(ArrayList<Product[]> allProduct) {
        this.psu = allProduct.get(4);
    }

    public Product[] getMboard() {
        return mboard;
    }

    public void setMboard(ArrayList<Product[]> allProduct) {
        this.mboard = allProduct.get(5);
    }

    public Product[] getCcase() {
        return ccase;
    }

    public void setCcase(ArrayList<Product[]> allProduct) {
        this.ccase = allProduct.get(6);
    }

    public Product[] getMonitor() {
        return monitor;
    }

    public void setMonitor(ArrayList<Product[]> allProduct) {
        this.monitor = allProduct.get(7);
    }

    public ArrayList<Product[]> getAllProduct() {
        return allProduct;
    }

    public void setAllProduct(ArrayList<Product[]> allProduct) {
        this.allProduct = allProduct;
    }
    
    public void setAllProduct(){
        allProduct.add(cpu);
        allProduct.add(gpu);
        allProduct.add(ram);
        allProduct.add(ssd);
        allProduct.add(psu);
        allProduct.add(mboard);
        allProduct.add(ccase);
        allProduct.add(monitor);
    }
        
    public void updateAllProduct(ArrayList<Product[]> allProduct){
        setMonitor(allProduct);
        setCcase(allProduct);
        setMboard(allProduct);
        setPsu(allProduct);
        setSsd(allProduct);
        setRam(allProduct);
        setGpu(allProduct);
        setCpu(allProduct);
    }
    
    public ArrayList reasembleAllProduct(Product[] cpu, Product[] gpu, Product[] ram, Product[] ssd, Product[] psu, Product[] mboard, Product[] ccase, Product[] monitor){
        ArrayList<Product[]> allProduct = new ArrayList<>();
        allProduct.add(cpu);
        allProduct.add(gpu);
        allProduct.add(ram);
        allProduct.add(ssd);
        allProduct.add(psu);
        allProduct.add(mboard);
        allProduct.add(ccase);
        allProduct.add(monitor);
        
        return allProduct;
    }
}