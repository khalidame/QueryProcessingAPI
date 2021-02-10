
public class QueryExtractApi {

	public String getFileName(String query) {
		query = query.toLowerCase();

		String[] arr1 = query.split(" from ");
		String[] arr2 = arr1[1].split(" ");

		return arr2[0];

	}

	public String getProjectedFields(String query) {
		query = query.toLowerCase();

		String[] arr1 = query.split("select ");
		String[] arr2 = arr1[1].split(" from ");

		return arr2[0];
	}

	public String getCondition(String query) {
		query = query.toLowerCase();

		if (query.contains("where")) {
			String[] arr1 = query.split(" where ");

			if (query.contains("where")) {
				String[] arr2 = arr1[1].split(" order by ");

				return arr2[0];
			} else {
				return arr1[0];
			}

		}

		return "no condition found";
	}

	public String getLogicalOperator(String query) {
		query = query.toLowerCase();

		if (query.contains("and")) {

			return "and";
		} else {
			return "no and operator found";
		}
	}

	public String getOrderByName(String query) {
		query = query.toLowerCase();

		if (query.contains("order by")) {
			String[] arr1 = query.split(" order by ");

			return arr1[1];
		}

		return "no order by name found";
	}

	public String getMainQuery(String query) {
		query = query.toLowerCase();

		String[] arr1 = query.split(" from ");
		String[] arr2 = arr1[1].split(" ");

		return arr1[0] + " from " + arr2[0];
	}
}
