import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.logging.Logger;

public class TestColas{
    Queue <Integer> l = null;

    @Before
    public void SetUp () throws QueueFullException {
         this.l = new QueueImpl<Integer>(5);
         this.l.push(1);
         this.l.push(2);
    }
    @Test
    public void testPush()throws QueueFullException {

        Assert.assertEquals("push", 2, this.l.size());
        l.push(114);
        l.push(12);
        Assert.assertEquals("push", 4, this.l.size());
    }

   @Test(expected = QueueFullException.class)
   public void testColaLlena() throws QueueFullException {
       Assert.assertEquals("cua plean", 2, this.l.size());
       l.push(2);
       l.push(3);
       l.push(4);
       Assert.assertEquals("cua plean", 5, this.l.size());
       l.push(6);
   }

    @Test
    public void testPop() throws QueueFullException, QueueEmptyException {

        Assert.assertEquals("push", 2, this.l.size());
        int i1 = l.pop();
        Assert.assertEquals("push", 1, i1);
        int i2 = l.pop();
        Assert.assertEquals("push", 2, i2);
    }

    @Test(expected = QueueEmptyException.class)
    public void testColaVacia() throws QueueFullException, QueueEmptyException {

        Assert.assertEquals("push", 2, this.l.size());
        int i1 = l.pop();
        Assert.assertEquals("push", 1, i1);
        int i2 = l.pop();
        Assert.assertEquals("push", 2, i2);

        int i3 = l.pop();
    }
}
