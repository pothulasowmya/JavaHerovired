class Table
{
	void printTable(int n)
	{
			for(int i=1;i<=5;i++)
			{
				System.out.println(+n+"*"+i+"="+(n*i));
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
	}
}

class Mythread1 extends Thread
{
	Table t;
	Mythread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}


class Mythread2 extends Thread
{
	Table t;
	Mythread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
class Mythread3 extends Thread{
    Table t;
    Mythread3(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(9);
    }
}
class Mythread4 extends Thread{
    Table t;
    Mythread4(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(55);
    }
}
class Use 
{
	public static void main(String args[])
	{
		Table obj = new Table();
		Mythread1 th1 = new Mythread1(obj);
		Mythread2 th2 = new Mythread2(obj);
        Mythread3 th3 = new Mythread3(obj);
		Mythread4 th4 = new Mythread4(obj);
		th1.start();
		th2.start();
        th3.start();
        th4.start();

	}
}
