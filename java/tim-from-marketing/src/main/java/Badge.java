class Badge {
    public String print(Integer id, String name, String department) 
    {
        if (id == null)
            return String.format("%s - %S", name, department == null ? "owner" : department);
        
        return String.format("[%s] - %s - %S", id, name, department == null ? "owner" : department);    
    }
}
