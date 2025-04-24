package com.spring.example.web_mvc_ex2;

import jakarta.validation.constraints.NotBlank;

public class Product {
    @NotBlank(message = "ID is required")
    private String pid;

    @NotBlank(message = "Napackage com.spring.example.web_mvc_ex2;\n" + //
                "\n" + //
                "import jakarta.validation.constraints.NotBlank;\n" + //
                "\n" + //
                "public class Product {\n" + //
                "    @NotBlank(message = \"ID is required\")\n" + //
                "    private String pid;\n" + //
                "\n" + //
                "    @NotBlank(message = \"Name is required\")\n" + //
                "    private String pname;\n" + //
                "\n" + //
                "    @NotBlank(message = \"Price is required\")\n" + //
                "    private String price;\n" + //
                "\n" + //
                "    // Getters and setters\n" + //
                "    public String getPid() {\n" + //
                "        return pid;\n" + //
                "    }\n" + //
                "\n" + //
                "    public void setPid(String pid) {\n" + //
                "        this.pid = pid;\n" + //
                "    }\n" + //
                "\n" + //
                "    public String getPname() {\n" + //
                "        return pname;\n" + //
                "    }\n" + //
                "\n" + //
                "    public void setPname(String pname) {\n" + //
                "        this.pname = pname;\n" + //
                "    }\n" + //
                "\n" + //
                "    public String getPrice() {\n" + //
                "        return price;\n" + //
                "    }\n" + //
                "\n" + //
                "    public void setPrice(String price) {\n" + //
                "        this.price = price;\n" + //
                "    }\n" + //
                "}\n" + //
                "me is required")
    private String pname;

    @NotBlank(message = "Price is required")
    private String price;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    
    
}
