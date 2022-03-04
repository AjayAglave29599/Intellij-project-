package Mockito;

import Mockito.EmployeeManager;
import Mockito.EnployeeService;
import org.junit.Before;

public class MockitoDemo {

    EnployeeService employeService;

    @Before
    public void setUp()
    {
        employeService = org.mockito.Mockito.mock(EnployeeService.class);
        EmployeeManager employeeManager= new EmployeeManager();
        employeeManager.setEmployeeService(employeService);
    }



}
