public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(int size) {
        employees = new Employee[size];
    }

    public void print() {
        for (Employee person : employees) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }

    public void print(int department) {
        for (Employee person : employees) {
            if (person != null && person.getDepartment() == department) {
                System.out.println(person);
            }
        }
    }

    public void add(Employee employee) {
        for (int i = 0; i < employees.length; i++)
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
    }

    public void delete(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(name)) {
                employees[i] = null;
                break;
            }
        }
    }

    public void delete(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    public void editSalary(String name, double salary) {
        for (Employee person : employees) {
            if (person != null && person.getFullName().equals(name)) {
                person.setSalary(salary);
            }
        }
    }

    public void editDepartment(String name, int department) {
        for (Employee person : employees) {
            if (person != null && person.getFullName().equals(name)) {
                person.setDepartment(department);
            }
        }
    }

    public Employee find(String name) {
        for (Employee person : employees) {
            if (person != null && person.getFullName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public Employee find(double salary) {
        for (Employee person : employees) {
            if (person != null && person.getSalary() == salary) {
                return person;
            }
        }
        return null;
    }

    public int findCount() {
        int count = 0;
        for (Employee person : employees) {
            if (person != null) {
                count++;
            }
        }
        return count;
    }

    public int findCount(int department) {
        int count = 0;
        for (Employee person : employees) {
            if (person != null && person.getDepartment() == department) {
                count++;
            }
        }
        return count;
    }

    public Employee findMinSalary() {
        double min = 1_000_000;
        for (Employee person : employees) {
            if (person != null && person.getSalary() < min) {
                min = person.getSalary();
            }
        }
        return find(min);
    }

    public Employee findMinSalary(int department) {
        double min = 1_000_000;
        for (Employee person : employees) {
            if (person != null && person.getDepartment() == department) {
                if (person.getSalary() < min) {
                    min = person.getSalary();
                }
            }
        }
        return find(min);
    }

    public Employee findMaxSalary() {
        double max = 0;
        for (Employee person : employees) {
            if (person != null && person.getSalary() > max) {
                max = person.getSalary();
            }
        }
        return find(max);
    }

    public Employee findMaxSalary(int department) {
        double max = 0;
        for (Employee person : employees) {
            if (person != null && person.getDepartment() == department) {
                if (person.getSalary() > max) {
                    max = person.getSalary();
                }
            }
        }
        return find(max);
    }

    public double calcSumSalary() {
        double sum = 0;
        for (Employee person : employees) {
            if (person != null) {
                sum += person.getSalary();
            }
        }
        return sum;
    }

    public double calcSumSalary(int department) {
        double sum = 0;
        for (Employee person : employees) {
            if (person != null && person.getDepartment() == department) {
                sum += person.getSalary();
            }
        }
        return sum;
    }

    public double calcMeanSalary() {
        return calcSumSalary() / findCount();
    }

    public double calcMeanSalary(int department) {
        return calcSumSalary(department) / findCount(department);
    }

    public void indexSalary(double percent) {
        for (Employee person : employees) {
            if (person != null) {
                person.setSalary(person.getSalary() * (1 + percent / 100));
            }
        }
    }

    public void indexSalary(int department, double percent) {
        for (Employee person : employees) {
            if (person != null && person.getDepartment() == department) {
                person.setSalary(person.getSalary() * (1 + percent / 100));
            }
        }
    }

    public void printMoreThanSalary(double salary) {
        for (Employee person : employees) {
            if (person != null && person.getSalary() >= salary) {
                System.out.println(person);
            }
        }
    }

    public void printLessThanSalary(double salary) {
        for (Employee person : employees) {
            if (person != null && person.getSalary() < salary) {
                System.out.println(person);
            }
        }
    }
}