/*
本程序实现的功能：
输入总和sum，以及三个数X,Y,Z；
求A B C，使得sum=A*X+B*Y+C*Z；
输出顺序为A B C；
*/
#define sum_all r_x1*x1+r_x2*x2+r_x3*x3
#include<vector>
#include<iostream>
using namespace std;
int main()
{
    int sum,x1,x2,x3;//总和sum，三个数x1，x2，x3。
    cout<<"输入总和。"<<endl;
    cin>>sum;
    cout<<"输入X1"<<endl;
    cin>>x1;
    cout<<"输入X2"<<endl;
    cin>>x2;
    cout<<"输入X3"<<endl;
    cin>>x3;
    vector <int>_x1;//x1的值
    vector <int>_x2;//x2的值
    vector <int>_x3;//x3的值
    int sum0=0,all=0;//all为总共的解的个数
    int r_x1=0,r_x2=0,r_x3=0;//x1,x2,x3的个数
    for(r_x1=0;sum0<sum;r_x1++){
        for(r_x2=0;sum0<sum;r_x2++){
            for(r_x3=0;sum0<sum;r_x3++){
                sum0=sum_all;
                if(sum0==sum)
                    goto end;}
            r_x3=0;
            sum0=sum_all;
            if(sum0==sum)
                goto end;}
        r_x2=0;
        sum0=sum_all;
        if(sum0==sum)
            goto end;
        else
            continue;
end:
    _x1.push_back(r_x1);
    _x2.push_back(r_x2);
    _x3.push_back(r_x3);
    all++;
    sum0=0;
    }
    for(int i=0;i<all;i++){
        cout<<_x1[i]<<" "
            <<_x2[i]<<" "
            <<_x3[i]<<endl;
    }
    if(all==0)
        cout<<"no"<<endl;
    system("pause");
    return 0;
}
