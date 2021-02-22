Meta:

Narrative:
 Mathemathics operations tests

Scenario: Add two numbers.
Given create instance of calculator
When add argument <value1> and <value2>
Then result should be <result>

Examples
| value1 | value1 | result |
| 2      |1       | 3      |
| 49     |51      | 100    |
| 22     |128     | 150    |