class Student
{
	private String name;
	private int id;
	 
	public void Set_name(String name)
	{
	    this.name=name;
	}
	public String Get_name()
	{
		return name;
	}
	
	public void Set_id(int id)
	{
	    this.id=id;
	}
	public int Get_id()
	{
		return id;
	}
	
	public static void main(String arg[])
	{
        Student s =new Student();
        s.Set_name(" My Name is Mona Gupta ");		
        System.out.println(" Name is :"+s.Get_name());	
       	
        s.Set_id(6754);
        System.out.println(" Id is :"+s.Get_id());		
		
		System.out.println(s.name);
		System.out.println(s.id);
       	    
	}

}














