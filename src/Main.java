public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Shegirbay Sandugash Kalmuratovna", 2, 400000);
        employees[1] = new Employee("Shegirbay Bekaris kalmuratovich", 3, 300000);
        employees[2] = new Employee("Myrzabayeva Zhanar Myrzabayeva", 1, 500000);
        employees[3] = new Employee("Orymbayeva Karlygash Segizbayevna", 2, 340000);
        employees[4] = new Employee("Baymagambetova Raushan Esenovna", 4, 200000);
        employees[5] = new Employee("Kopbolsin Beksultan Sultanovich", 3, 120000);
        employees[6] = new Employee("Musin Suleyman Armanovich", 5, 800000);
        employees[7] = new Employee("Galimova Saltanat Aidarchanovna", 1, 230000);
        employees[8] = new Employee("Didarov Aslan Abishovich", 5, 750000);
        employees[9] = new Employee("Yusupova Aruzhan Yerbolovna", 3, 370000);

        printAll(employees);
        System.out.println(getSumOfSalary(employees, 3));
        System.out.println(getAverageOfSalary(employees, 3));
        System.out.println(getMinSalary(employees, 3));
        raiseSalary(employees, 20, 2);
        printAll(employees, 2);
        getEmployeeMoreSalary(employees, 500000);

    }

    public static int getLength(Employee[] arr) {
        int length = 0;
        for (Employee i : arr) {
            if (i != null) {
                length++;
            }
        }
        return length;
    }

    public static void printAll(Employee[] arr) {
        for (Employee emp : arr) {
            if (emp != null) {
                System.out.println(emp);
            }
        }
    }

    public static double getSumOfSalary(Employee[] arr) {
        double sum = 0;
        for (Employee emp : arr) {
            if (emp != null) {
                sum += emp.getSalary();
            }
        }
        return sum;
    }

    public static Employee getMinSalary(Employee[] arr) {
        Employee minSalaryEmployee = arr[0];
        for (Employee emp : arr) {
            if (emp != null) {
                if (emp.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = emp;
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee getMaxSalary(Employee[] arr) {
        Employee maxSalaryEmployee = arr[0];
        for (Employee emp : arr) {
            if (emp != null) {
                if (emp.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = emp;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double getAverageOfSalary(Employee[] arr) {
        return getSumOfSalary(arr) / getLength(arr);
    }

    public static void getAllFullName(Employee[] arr) {
        for (Employee i : arr) {
            if (i != null) {
                System.out.println(i.getFullName());
            }
        }
    }

    public static void raiseSalary(Employee[] arr, int percent) {
        double newSalary;
        for (Employee i : arr) {
            if (i != null) {
                newSalary = i.getSalary() * (100 + percent) / 100;
                i.setSalary(newSalary);
            }
        }
    }


    public static Employee[] getNewEmployees(Employee[] arr, int department) {
        int count = 0;
        Employee[] newEmployee = new Employee[10];
        for (Employee i : arr) {
            if (i != null) {
                if (i.getDepartment() == department) {
                    newEmployee[count] = i;
                    count++;
                }
            }
        }
        return newEmployee;
    }

    public static double getSumOfSalary(Employee[] arr, int department) {
        Employee[] newEmp = getNewEmployees(arr, department);
        return getSumOfSalary(newEmp);
    }

    public static Employee getMinSalary(Employee[] arr, int department) {
        Employee[] newEmp = getNewEmployees(arr, department);
        return getMinSalary(newEmp);
    }

    public static Employee getMaxSalary(Employee[] arr, int department) {
        Employee[] newEmp = getNewEmployees(arr, department);
        return getMaxSalary(newEmp);
    }

    public static double getAverageOfSalary(Employee[] arr, int department) {
        Employee[] newEmp = getNewEmployees(arr, department);
        return getAverageOfSalary(newEmp);
    }

    public static void raiseSalary(Employee[] arr, int percent, int department) {
        Employee[] newEmp = getNewEmployees(arr, department);
        raiseSalary(newEmp, percent);
    }

    public static void printAll(Employee[] arr, int department) {
        for (Employee emp : arr) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    System.out.println(emp.getId() + " " + emp.getFullName() + " " + emp.getSalary());
                }
            }
        }
    }

    public static void getEmployeeLessSalary(Employee[] arr, int number) {
        for (Employee emp : arr) {
            if (emp.getSalary() < number) {
                System.out.println(emp.getId() + " " + emp.getFullName() + " " + emp.getSalary());
            }
        }
    }

    public static void getEmployeeMoreSalary(Employee[] arr, int number) {
        for (Employee emp : arr) {
            if (emp != null) {
                if (emp.getSalary() >= number) {
                    System.out.println(emp.getId() + " " + emp.getFullName() + " " + emp.getSalary());
                }
            }
        }
    }
}