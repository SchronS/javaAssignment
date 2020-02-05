<template>
    <div class="inputFormText">
        <div class="inputFormTextInner">
            <p>{{ fieldName }}</p>
        </div>
        <div class="inputFormTextInner">
            <input v-model="fieldInput">
        </div>
    </div>
</template>

<script>
export default {
    name: "InputFormText",
    props: ['fieldName','fieldInputVal'],
    computed:{
        fieldInput:{
            get(){
                return this.fieldInputVal;
            },
            set(val){
                this.$emit('input',val);
            }
        }
    }
}
</script>

<style scoped>
.inputFormText{
    display: flex;
    flex-direction: column;
    align-items: self-start;
}

.inputFormTextInner{
    display: flex;
    flex-direction: column;
    align-items: self-start;
}

.inputFormTextInner p{
    color: #c03;
    font-size: 20px;
    margin: 8px;
    margin-left: 20px;
    font-weight: 600;
}

.inputFormTextInner input{
    color:#fff;
    background: #1e252b;
    border: none;
    margin-left: 20px;
    margin-right: 20px;
    padding: 10px;
    font-size: 16px;
    border-radius: 8px;
}

.inputFormTextInner input:hover{
    background: #11161a;
}

.inputFormTextInner input:focus{
    background: #11161a;
}
</style>