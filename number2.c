#include<stdio.h>
#include<string.h>
struct employee{
	char name[50];
	int salary;
	int hours;
    int newsalary;

}e[5];

int main(){
	int i;

	for(i=0; i<5; i++){
		printf("Enter the name of employee: \n");
		scanf("%s", &e[i].name);
		
		printf("Enter the salary of employee: \n");
		scanf("%d", &e[i].salary );
		
		printf("Enter the working hours of employee: \n");
		scanf("%d", &e[i].hours);
	}
	
	printf("Results \n");
	for(i=0; i<5; i++){
		if(e[i].hours>=8){
		e[i].newsalary = e[i].salary+50;
			printf("Name of employee: %s \n", e[i].name);
			printf("Salary of employee: %d \n", e[i].newsalary);
	}
	

		if(e[i].hours >=10){
		e[i].newsalary = e[i].salary+100;
			printf("Name of employee: %s \n", e[i].name);
			printf("Salary of employee: %d \n", e[i].newsalary);
		}
	

		if(e[i].hours >=12){
			e[i].newsalary = e[i].salary+ 150;
			printf("Name of employee: %s \n", e[i].name);
			printf("Salary of employee: %d \n", e[i].newsalary);
		}
	
}
return 0;
}