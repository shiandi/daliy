/*
������ʵ�ֵĹ��ܣ�
�����ܺ�sum���Լ�������X,Y,Z��
��A B C��ʹ��sum=A*X+B*Y+C*Z��
���˳��ΪA B C��
*/
#define sum_all r_x1*x1+r_x2*x2+r_x3*x3
#include<vector>
#include<iostream>
using namespace std;
int main()
{
    int sum,x1,x2,x3;//�ܺ�sum��������x1��x2��x3��
    cout<<"�����ܺ͡�"<<endl;
    cin>>sum;
    cout<<"����X1"<<endl;
    cin>>x1;
    cout<<"����X2"<<endl;
    cin>>x2;
    cout<<"����X3"<<endl;
    cin>>x3;
    vector <int>_x1;//x1��ֵ
    vector <int>_x2;//x2��ֵ
    vector <int>_x3;//x3��ֵ
    int sum0=0,all=0;//allΪ�ܹ��Ľ�ĸ���
    int r_x1=0,r_x2=0,r_x3=0;//x1,x2,x3�ĸ���
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
