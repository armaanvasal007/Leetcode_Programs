class Final_Value_of_Variable_After_Performing_Operations_2011
{
    public int finalValueAfterOperations(String[] operations) 
    {
        int X=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("X++")||operations[i].equals("++X"))
            {
                X++;
            }
            else if(operations[i].equals("X--")||operations[i].equals("--X"))
            {
                X--;
            }
        }
        return X;
    }
}