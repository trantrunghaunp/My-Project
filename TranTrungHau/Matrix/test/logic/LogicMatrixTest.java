/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class LogicMatrixTest {
    //1: Pass
    @Test
    public void testAdditionMatrixValid() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };
        int[][] expected = {
            {6, 8},
            {10, 12}
        };
        int[][] result = logicMatrix.additionMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    
    //2: Pass
    @Test
    public void testAdditionMatrixValid2() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {1, 2, 5},
            {3, 4, 6}
        };
        int[][] matrix2 = {
            {5, 6, 1},
            {7, 8, 0}
        };
        int[][] expected = {
            {6, 8, 6},
            {10, 12, 6}
        };
        int[][] result = logicMatrix.additionMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }

    // 3:Fail
    @Test
    public void testAdditionMatrixDifferentSizes() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {3, 4},
            {5, 6},
            {7, 8}
        };
        int[][] expected = {
            
        };
        int[][] result = logicMatrix.additionMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    
    // 4: Fail
    @Test
    public void testAdditionMatrixDifferentSizes2() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {1},
            {3}
        };
        int[][] matrix2 = {
            {3, 4},
            {5, 6},
            {7, 8}
        };
        int[][] expected = {
            
        };
        int[][] result = logicMatrix.additionMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
        
    }
    
    // 5: Pass
    @Test
    public void testSubtractionMatrixValid() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {5, 3},
            {7, 2}
        };
        int[][] matrix2 = {
            {2, 1},
            {1, 2}
        };
        int[][] expected = {
            {3, 2},
            {6, 0}
        };
        int[][] result = logicMatrix.subtractionMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    
    // 6: Pass
    @Test
    public void testSubtractionMatrixValid2() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {5, 6},
            {7, 2}
        };
        int[][] matrix2 = {
            {2, 1},
            {1, 2}
        };
        int[][] expected = {
            {3, 5},
            {6, 0}
        };
        int[][] result = logicMatrix.subtractionMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }

    // 7: Fail
    @Test
    public void testSubtractionMatrixDifferentSizes() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {3, 4},
            {5, 6},
            {7, 8}
        };
        int[][] expected = {
            
        };
        int[][] result = logicMatrix.subtractionMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    
    // 8: Fail
    @Test
    public void testSubtractionMatrixDifferentSizes2() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {3, 4, 7},
            {5, 6, 8},
        };
        int[][] expected = {
            
        };
        int[][] result = logicMatrix.subtractionMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    
    // 9: Pass
    @Test
    public void testMultiplicationMatrix() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };
        int[][] expected = {
            {19, 22},
            {43, 50}
        };
        int[][] result = logicMatrix.multiplicationMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    
    // 10: Pass
    @Test
    public void testMultiplicationMatrix2() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {0, 0},
            {0, 0}
        };
        int[][] expected = {
            {0, 0},
            {0, 0}
        };
        int[][] result = logicMatrix.multiplicationMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
            
    // 11: Fail
    @Test
    public void testMultiplicationMatrixErr() {
        LogicMatrix logicMatrix = new LogicMatrix();
        // Khởi tạo mảng ma trận thứ nhất
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {5, 6, 7},
            {8, 9, 10}
        };
        int[][] expected = {
           
        };
        int[][] result = logicMatrix.multiplicationMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    
    // 11: Fail
    @Test
    public void testMultiplicationMatrixErr2() {
        LogicMatrix logicMatrix = new LogicMatrix();
        // Khởi tạo mảng ma trận thứ nhất
        int[][] matrix1 = {
            {1},
            {3}
        };
        int[][] matrix2 = {
            {5, 6, 7},
            {8, 9, 10}
        };
        int[][] expected = {
           
        };
        int[][] result = logicMatrix.multiplicationMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    
}
