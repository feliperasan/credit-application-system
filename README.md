# Credit Application System
A loan company needs to create a credit application analysis system. Your task will be to create a SPRING BOOT AND KOTLIN REST API for the company to provide its customers with the following functionalities:

### Customer:
**Register:**
Request: firstName, lastName, cpf, income, email, password, zipCode, and street
Response: String

**Edit registration:**
1. Request: id, firstName, lastName, income, zipCode, street
2. Response: firstName, lastName, income, cpf, email, income, zipCode, street

**View profile:**
1. Request: id
2. Response: firstName, lastName, income, cpf, email, income, zipCode, street

**Delete registration:**
1. Request: id
2. Response: no return

### Loan Request (Credit):
**Register:**
1. Request: creditValue, dayFirstOfInstallment, numberOfInstallments, and customerId
2. Response: String

**List all loan requests from a customer:**
1. Request: customerId
2. Response: creditCode, creditValue, numberOfInstallment

**View a loan:**
1. Request: customerId and creditCode
2. Response: creditCode, creditValue, numberOfInstallment, status, emailCustomer, and incomeCustomer

## MVC Project Structure
![](https://camo.githubusercontent.com/c471733843f8553f936ead5092a4920d6f6ba691631f0bf44dc8a3fb4a309658/68747470733a2f2f692e696d6775722e636f6d2f314561355048332e706e67)

## UML
[![](https://mermaid.ink/img/pako:eNqNVF1v2jAU_SuWn9oOECElgaiqBIFNmbq2grUPVaTJiw2z5tjIdrZRRH_7nDhAElKpfoide47vx7m2dzARmMAAJgwpNaNoLVEac2CG_YaZ0iIlEsSw3-tdxRBcdbvC_DlmGUqCqQYBCAXXiHJ1tidniW4XTDCWRKlzqvVwIi410lnOo4ZhOUVqJ6c7a81HTpeUr8GKSqXvUUpaMLP7PSjZrFqsJEWUtdg3Jo2_QuIqdKirnKvQlK5nJKEpYoDyRNQTuKNKv9ni30BSzLXNd8IEpPggQT4-AYX-kIujDkm5uDxKU-WuKMfTbYQvSk_tLEwY0eTIsdC-IbxtUU32p6doVqYdmvPzTtmW8IxYVq9dJIjNkCYAo-3nvHMRVxoxlhKuq8SIa8Cz9CeRD6sKRdV7U5wXVUxV4EynD8prq7WpX5bFN4WdMDbdHgJY9Q5RIqN0tbnnPQmPsjV3dpq61uM3-nI4em334ZVumn0pEaUlIe0OSykr_m5u5kZ_IpGmgt_enoDo_sfj4uHLYr5cnoyTR2N7ns9OlsX86zz8XgaDHWhcmbuFzXNTBImh_kXMvYCBWWIkf8cw5jkPZVostzyBgZYZ6cBsg81xKV8nGKwQU8a6QRwGO_gPBk5_0Bs4Q8_3_OuhOxy6ow7c5ma3Z_5GrjfwxkPXdfcd-CqE8dDvja790dgZeb7j9f2x7xTuXgrQxsx1F_Jb-Trm0_4_qOmNJw?type=png)](https://mermaid.live/edit#pako:eNqNVF1v2jAU_SuWn9oOECElgaiqBIFNmbq2grUPVaTJiw2z5tjIdrZRRH_7nDhAElKpfoide47vx7m2dzARmMAAJgwpNaNoLVEac2CG_YaZ0iIlEsSw3-tdxRBcdbvC_DlmGUqCqQYBCAXXiHJ1tidniW4XTDCWRKlzqvVwIi410lnOo4ZhOUVqJ6c7a81HTpeUr8GKSqXvUUpaMLP7PSjZrFqsJEWUtdg3Jo2_QuIqdKirnKvQlK5nJKEpYoDyRNQTuKNKv9ni30BSzLXNd8IEpPggQT4-AYX-kIujDkm5uDxKU-WuKMfTbYQvSk_tLEwY0eTIsdC-IbxtUU32p6doVqYdmvPzTtmW8IxYVq9dJIjNkCYAo-3nvHMRVxoxlhKuq8SIa8Cz9CeRD6sKRdV7U5wXVUxV4EynD8prq7WpX5bFN4WdMDbdHgJY9Q5RIqN0tbnnPQmPsjV3dpq61uM3-nI4em334ZVumn0pEaUlIe0OSykr_m5u5kZ_IpGmgt_enoDo_sfj4uHLYr5cnoyTR2N7ns9OlsX86zz8XgaDHWhcmbuFzXNTBImh_kXMvYCBWWIkf8cw5jkPZVostzyBgZYZ6cBsg81xKV8nGKwQU8a6QRwGO_gPBk5_0Bs4Q8_3_OuhOxy6ow7c5ma3Z_5GrjfwxkPXdfcd-CqE8dDvja790dgZeb7j9f2x7xTuXgrQxsx1F_Jb-Trm0_4_qOmNJw)

## Instruction for Use
In terminal:
1. Make a clone of the project on your machine:
`git clone git@github.com:cami-la/credit-application-system.git`
2. Go to the project root folder: `cd project_name`
3. Run the command: `./gradlew bootrun`