#include<stdio.h>
#include<math.h>
void velocityCalc(float v,float u,float t,float a){

if(isnan(v)){
    v=u+a*t;
    printf("the velocity=%f",v);
}
else if(isnan(u)){
    u=v-a*t;
    printf("the initial velocity is=%f",u);

}
else if(isnan(t)){
    t=(v-u)/a;
    printf("the time is=%f",t);
}
else if(isnan(a)){
    a=(v-u)/t;
    printf("the acceleration is=%f",a);
}
}
void main (){
    velocityCalc(2.6,NAN,3.5,6.7);
}