import algorithm.ChaseAlgorithm;
import constraints.Constraint;
import constraints.EGD;
import constraints.TGD;
import database.Database;
import database.Table;
import database.Tuple;
import org.junit.Test;
import util.ReadFiles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ChaseAlgorithmTest {

    @Test
    public void testChaseForTGD(){
        Database database = new Database();
        database.initializeDatabase();
        List<TGD> tgds = ReadFiles.readTGDs("examples/TGD_test/test3/TGD.txt");
        ChaseAlgorithm.chaseForTGD(database,tgds);
        System.out.println(database);
    }

    @Test
    public void testStandardChase(){
        Database database = new Database();
        database.initializeDatabase();
        List<TGD> tgds = ReadFiles.readTGDs("examples/test/TGD.txt");
        List<EGD> egds = ReadFiles.readEGDs("examples/test/EGD.txt");
        List<Constraint> constraints = new ArrayList<>();
        constraints.addAll(tgds);
        constraints.addAll(egds);
        ChaseAlgorithm.standardChase(database,constraints);
        System.out.println(database);
    }

    @Test
    public void testObliviousChase(){
        Database database = new Database();
        database.initializeDatabase();
        List<TGD> tgds = ReadFiles.readTGDs("examples/test2/TGD.txt");
        List<Constraint> constraints = new ArrayList<>(tgds);
        ChaseAlgorithm.obliviousChase(database,constraints);
        System.out.println(database);
    }

    @Test
    public void testSemiObliviousChase(){
        Database database = new Database();
        database.initializeDatabase();
        List<TGD> tgds = ReadFiles.readTGDs("examples/test2/TGD.txt");
        List<Constraint> constraints = new ArrayList<>(tgds);
        ChaseAlgorithm.semiObliviousChase(database,constraints);
        System.out.println(database);
    }

}