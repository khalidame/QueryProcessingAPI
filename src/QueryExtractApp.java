
public class QueryExtractApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      QueryExtractApi obj = new QueryExtractApi();
      
      String query=" Select name, city from Emp where age > 20 and city = 'New York' order By name";
      
      String fileName = obj.getFileName(query);
      String fields = obj.getProjectedFields(query);
      String conditions = obj.getCondition(query);
      String logicOperator = obj.getLogicalOperator(query);
      String orderByName = obj.getOrderByName(query);
      String mainQuery = obj.getMainQuery(query);
      
      System.out.println(fileName );
      System.out.println(fields);
      System.out.println(conditions);
      System.out.println(logicOperator);
      System.out.println(orderByName);
      System.out.println(mainQuery );
	}

}
